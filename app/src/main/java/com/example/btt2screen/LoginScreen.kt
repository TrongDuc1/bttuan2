package com.example.btt2screen

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_login_screen.btn_login
import kotlinx.android.synthetic.main.activity_login_screen.input_email
import kotlinx.android.synthetic.main.activity_login_screen.input_password
import kotlinx.android.synthetic.main.activity_login_screen.view.*
import kotlinx.android.synthetic.main.activity_sign_up_screen.*
import kotlinx.android.synthetic.main.activity_welcomescreen.view.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        textsignup.setOnClickListener {
            startActivity(Intent(this, SignUpScreen::class.java))
        }
        back.setOnClickListener {
            startActivity(Intent(this, SignUpScreen::class.java))
        }
        btn_login.setOnClickListener {
            login()
        }
    }
    private fun login(){
        if(input_email.text.toString().equals(Util.ACCOUNT) && input_password.text.toString().equals(Util.PASS_WORD)) {
            val builder = android.app.AlertDialog.Builder(this)
            builder.setMessage("Login success")
                .setPositiveButton("Ok", { dialogInterface: DialogInterface, i: Int -> goHome() })
                .show()
        } else {
            val builder = android.app.AlertDialog.Builder(this)
            builder.setMessage("Login faild")
                .setNegativeButton("Ok", { dialogInterface: DialogInterface, i: Int ->})
                .show()
        }
    }
    object Util {
        val ACCOUNT = "username@gmail.com"
        val PASS_WORD = "123456"
    }
    private fun goHome() {
        startActivity(Intent(this, ProfileScreen::class.java))

    }
}
