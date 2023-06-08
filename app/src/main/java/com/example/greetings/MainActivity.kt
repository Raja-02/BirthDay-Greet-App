package com.example.greetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)   //resource for string input
        button.setOnClickListener {
            callActivity()  //function call to take string input
        }
    }

    private fun callActivity() { //function to take string input
        val editText=findViewById<EditText>(R.id.nameinput)
        val message=editText.text.toString()
        val st="Happy BirthDay\n"
        val intent=Intent(this,birth_greet::class.java).also{//an intent to call next activity
            it.putExtra("EXTRA_MESSAGE",st+message) //passing the string
            startActivity(it) //second activity call
        }
    }
}