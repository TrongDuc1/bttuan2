package com.example.btt2screen
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profile_screen.*


class ProfileScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)
        backsu.setOnClickListener {
            startActivity(Intent(this, LoginScreen::class.java))
        }
        val editText = findViewById<TextView>(R.id.full_name)
        val textView = findViewById<TextView>(R.id.textV5)
        val editText1 = findViewById<TextView>(R.id.email)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence,
                i: Int, i1: Int, i2: Int
            ) {
                //Gọi trước khi text thay đổi
            }
            override fun onTextChanged(
                charSequence: CharSequence,
                i: Int, i1: Int, i2: Int
            ) {
                //Gọi khi thay đổi
            }
            override fun afterTextChanged(editable: Editable) {
                //Gọi sau khi thay đổi
                textView.text = editText.text.toString()
            }
        })
        showEditTextDialog()

    }
    private fun showEditTextDialog(){
        full_name.setOnClickListener {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.dialog_edit,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            with(builder) {
                setPositiveButton("Ok"){dialog, which -> full_name.text = editText.text}
                setNegativeButton("Cancel"){dialog,which -> Log.d( "Main", "Negative button clicked")}
                setView(dialogLayout)
                show()
            }
        }
        email.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.dialog_edit,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            with(builder) {
                setPositiveButton("Ok"){dialog, which -> email.text = editText.text}
                setNegativeButton("Cancel"){dialog,which -> Log.d( "Main", "Negative button clicked")}
                setView(dialogLayout)
                show()
            }
        }
        phone_number.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.dialog_edit,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            with(builder) {
                setPositiveButton("Ok"){dialog, which -> phone_number.text = editText.text}
                setNegativeButton("Cancel"){dialog,which -> Log.d( "Main", "Negative button clicked")}
                setView(dialogLayout)
                show()
            }
        }
    }
}