package com.example.btt2screen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_on_boardingtwo.*

enum class WindowSizeClass { COMPACT, MEDIUM, EXPANDED }
class OnBoardingtwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boardingtwo)
        button2.setOnClickListener{
//            Toast.makeText(this,"Hi", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, Onboardingthree::class.java)
            startActivity(intent)
        }

    }
}