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
    EditText e1;
    EditText e2;
    ArrayList<Button> btns = new ArrayList<>();

    class Listener implements View.OnClickListener{

        Button b;
        TextView result;

        public Listener(Button b, TextView result) {
            this.b = b;
            this.result = result;
        }

        @Override
        public void onClick(View view) {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.eText1);
        e2 = (EditText) findViewById(R.id.eText2);
        TextView result = (TextView) findViewById(R.id.eTextR);

        btns.add((Button) findViewById(R.id.button1));
        btns.add((Button) findViewById(R.id.button2));
        btns.add((Button) findViewById(R.id.button3));
        btns.add((Button) findViewById(R.id.button4));

        for (Button b : btns) {
            Listener lis = new Listener(b, result);
        }
    }

    public static String calc(Button b, int num1, int num2) {
        System.out.println("b : " + b);
        int sum = 0;
        if (b.getText() == "+") {
            sum = num1 + num2;
            return sum+"";
        }
        if (b.getText() == "-") {
            sum = num1 - num2;
            return sum+"";
        }
        if (b.getText() == "*") {
            sum = num1 * num2;
            return sum+"";
        }
        sum = num1 / num2;
        return sum+"";
    }
}