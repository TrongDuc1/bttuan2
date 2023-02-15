package com.example.btt2screen
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_welcomescreen.*


class Welcomescreen : AppCompatActivity() {
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomescreen)
        //SignIn.setPaintFlags(SignIn.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
        Signup.setOnClickListener {
            val intent: Intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }
        textSignIn.setOnClickListener{
            val intent: Intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
        s.setOnClickListener{
            Toast.makeText(this,"Đăng nhập bằng Facebook", Toast.LENGTH_SHORT).show()

        }
        f.setOnClickListener{
            Toast.makeText(this,"Đăng nhập bằng Google", Toast.LENGTH_SHORT).show()

        }
    }
}
