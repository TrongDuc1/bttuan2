package com.example.btt2screen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboardingthree.*

class Onboardingthree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardingthree)
        button3.setOnClickListener{
//            Toast.makeText(this,"Hi", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, Welcomescreen::class.java)
            startActivity(intent)
        }
    }
}