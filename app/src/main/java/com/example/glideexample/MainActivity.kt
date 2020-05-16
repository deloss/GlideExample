package com.example.glideexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this).load("https://androidayuda.com/app/uploads-androidayuda.com/2019/07/android.jpg")
                .placeholder(android.R.drawable.btn_plus).into(imagen)
    }
}
