package com.example.rashidsaleem.albumapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.rashidsaleem.albumapp.adapter.StudentAdapter
import com.example.rashidsaleem.albumapp.model.Student
import com.example.rashidsaleem.albumapp.util.DummyData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener {


    public final var TAG: String = MainActivity::class.java.simpleName
//    public final var TAG: String = MainActivity::class.simpleName!!

    lateinit var studentArrayList: ArrayList<Student>
    lateinit var listView: ListView
    lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting View Elements
        listView = list_view as ListView


        studentArrayList= DummyData().GenerateStudentsData()

        studentAdapter = StudentAdapter(this, R.layout.list_item, studentArrayList);

        listView.adapter = studentAdapter

        listView.onItemClickListener = this

        var socialMedia : String = studentArrayList.get(0).getSocialMediaInStringFormat()


        Log.d(TAG, "Hello from Main");

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var student: Student = studentArrayList.get(position)

        var intent: Intent = Intent(this, StudentDetailActivity::class.java)

        intent.putExtra("student", student)



        startActivity(intent)

        Log.d(TAG, "position: " + position);

    }


}
