package com.example.rashidsaleem.albumapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.rashidsaleem.albumapp.model.Student
import kotlinx.android.synthetic.main.activity_student_detail.*

class StudentDetailActivity : AppCompatActivity() {

    val TAG: String = StudentDetailActivity::class.java.simpleName

    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_detail)

        var intent: Intent = intent

        student = intent.getParcelableExtra("student");

        // Setting values to views
        tv_name.text = student.name
        tv_phone_no.text = student.phoneNo
        tv_address.text = student.address

        tv_quote.text = student.bestQuote

        Log.d(TAG, "student Name: " + student.name);



    }
}
