package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    ArrayList<Button> btns = new ArrayList<>();
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = Integer.parseInt(findViewById(R.id.eText1).toString());
        num2 = Integer.parseInt(findViewById(R.id.eText2).toString());
        int sum = num1 + num2;
        result = (TextView) findViewById(R.id.eTextR);

        btns.add((Button) findViewById(R.id.button1));
        btns.add((Button) findViewById(R.id.button2));
        btns.add((Button) findViewById(R.id.button3));
        btns.add((Button) findViewById(R.id.button4));

        btns.get(0).setOnClickListener(e->{
            String str = sum + "";
            result.setText(str);
        });

    }
}