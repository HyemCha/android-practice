package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    ArrayList<Button> btns = new ArrayList<>();
    Listener lis;
    TextView result = (TextView) findViewById(R.id.eTextR);

    class Listener implements View.OnClickListener {

        Button b;

        public Listener(Button b) {
            this.b = b;
        }

        public int calculate(int num1, int num2) {
            if(b.getText()=="+")
                return num1 + num2;
            if(b.getText()=="-")
                return num1 - num2;
            if(b.getText()=="*")
                return num1 * num2;
            return num1 / num2;
        }

        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(((EditText) findViewById(R.id.eText1)).getText().toString());
            num2 = Integer.parseInt(((EditText) findViewById(R.id.eText2)).getText().toString());
            String sum = calculate(num1, num2) + "";

            result.setText(sum);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns.add((Button) findViewById(R.id.button1));
        btns.add((Button) findViewById(R.id.button2));
        btns.add((Button) findViewById(R.id.button3));
        btns.add((Button) findViewById(R.id.button4));

        for (Button b : btns) {
            lis = new Listener(b);
            b.setOnClickListener(lis);
        }
    }
}