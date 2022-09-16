package com.example.myapplication03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.myapplication03_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // var : 가변, val : 불변
//    val imageView : ImageView = findViewById(R.id.imageView)
//    val imageView2 : ImageView = findViewById(R.id.imageView2)
//    val imageView3 : ImageView = findViewById(R.id.imageView3)

    //private var binding: ActivityMainBinding ?= null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        //activity_main.xml과 결합(바인딩)
        //생성된 결합 클래스 이름 : ActivityMainBinding,
        // xml파이르이 이름을 카멜표기법으로 변환하고 끝에 'Binding'을 추가하여 생성됨,
        // 필드로 id가 설정된 컴포넌트를 가짐
        binding = ActivityMainBinding.inflate(layoutInflater)
        //ActivityMainBinding클래스의 getRoo()메서드가 LinearLayout 루트 뷰를 반환
        setContentView(binding.root)
    }
}