package com.example.uff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val go_to_other_activity= findViewById<Button>(R.id.button)
        val exit= findViewById<Button>(R.id.button2)
go_to_other_activity.setOnClickListener{
    val intent = Intent(this, true_or_false::class.java)
    startActivity(intent)
}
        exit.setOnClickListener{
            finish()
        }
    }
}