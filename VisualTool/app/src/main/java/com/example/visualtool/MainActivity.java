package com.example.visualtool;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    class Listener implements View.OnClickListener{

        Button b;

        public Listener(Button btn){
            b = btn;
        }

        @Override
        public void onClick(View view) {
            b.setBackgroundColor(Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        }
    }

    Random r = new Random();
    ArrayList<Button> btns = new ArrayList<>();
    Listener lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns.add((Button) findViewById(R.id.button1));
        btns.add((Button) findViewById(R.id.button2));
        btns.add((Button) findViewById(R.id.button3));
        btns.add((Button) findViewById(R.id.button4));
        btns.add((Button) findViewById(R.id.button5));

        for (Button b : btns) {
            lis = new Listener(b);
            b.setOnClickListener(lis);
        }
    }
}