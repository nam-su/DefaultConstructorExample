package com.example.defaultconstructorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // textView 선언
    lateinit var nameTextView: TextView
    lateinit var ageTextView: TextView
    lateinit var hobbyTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // textView 초기화
        nameTextView = findViewById(R.id.nameTextView)
        ageTextView = findViewById(R.id.ageTextView)
        hobbyTextView = findViewById(R.id.hobbyTextView)

        // student 객체 생성 및 초기화
        val student = Student()

        // 텍스트뷰에 student 객체의 변수 할당
        nameTextView.text = student.name
        ageTextView.text = student.age.toString()
        hobbyTextView.text = student.hobby

    }

}