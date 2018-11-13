package com.example.rashidsaleem.albumapp

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TestActivity : AppCompatActivity() {

    lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        imageView =  findViewById(R.id.img_test) as ImageView

        var imageId: Int = R.mipmap.hamaad

        imageView.setImageResource(imageId)


    }
}
