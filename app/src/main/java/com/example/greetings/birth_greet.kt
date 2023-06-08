package com.example.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birth_greet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_greet)
        val message=intent.getStringExtra("EXTRA_MESSAGE") //receive the string
        val textView=findViewById<TextView>(R.id.textView).apply {
            text=message
        }
    }
}