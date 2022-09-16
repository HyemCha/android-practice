package com.example.myapplication03_1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_java extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox:
                if (checked) imageView1.setImageResource(R.drawable.meat);
                else imageView1.setImageResource(0);
                break;
            case R.id.checkBox2:
                if (checked) imageView2.setImageResource(R.drawable.cheese);
                else imageView2.setImageResource(0);
                break;
        }
    }

    public void onRadioClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox:
                if (checked) imageView3.setImageResource(R.drawable.meat);
                break;
            case R.id.checkBox2:
                if (checked) imageView3.setImageResource(R.drawable.cheese);
                break;
        }
    }
}
