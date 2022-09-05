package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private TextView textView;
//    EditText eText;
//
//    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.lay_test);
//        eText = (EditText) findViewById(R.id.editText);
//        btn = (Button) findViewById(R.id.button2);
//        textView = (TextView) findViewById(R.id.textView1);
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                textView.setTextSize(60);
//                textView.setTextColor(Color.argb(255, 24, 149, 245));
//                String str = eText.getText().toString();
//                textView.setText(str);
//            }
//        });

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        Button b1 = new Button(this);
        b1.setText("첫번째 버튼");
        container.addView(b1);

        Button b2 = new Button(this);
        b2.setText("두번째 버튼");
        container.addView(b2);

        setContentView(container);

    }

    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "클릭!☝", Toast.LENGTH_SHORT).show();
    }
}