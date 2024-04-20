package com.example.defaultconstructorexample

class Student {

    var name: String?
    var age: Int
    var hobby: String?

    // 기본 생성자가 호출 되었을때 값이 초기화
    init {

        name = "Sam"
        age = 19
        hobby = "숨쉬기 운동"

    }

}