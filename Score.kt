package com.example.uff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        //Get the score from the other activity
        val score = intent.getIntExtra("score", 0)
        //Show the score
        val score_label = findViewById<android.widget.TextView>(R.id.textView2)
        score_label.text = "Your score is $score"
    }
}