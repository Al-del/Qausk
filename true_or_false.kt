package com.example.uff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class anwort(val number_of_questions: Int){
   //Crete a string vector anwort
    var anwort = arrayOfNulls<String?>(number_of_questions);
    var correct_anwort = arrayOfNulls<Boolean?>(number_of_questions);
}
class true_or_false : AppCompatActivity() {
    var curent_question = 0;
    var score = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true_or_false)
        val number_of_questions = 3;
        val anwort = anwort(number_of_questions);
        anwort.anwort[0] = "Is the sky blue?";
        anwort.correct_anwort[0] = true;
        anwort.anwort[1] = "Is the grass green?";
        anwort.correct_anwort[1] = true;
        anwort.anwort[2] = "Is the sun yellow?";
        anwort.correct_anwort[2] = false;
        //Shuffle the questions
        anwort.anwort.shuffle();
        anwort.correct_anwort.shuffle();

        var corect_button = findViewById<Button>(R.id.button3)
        var incorect_button = findViewById<Button>(R.id.button4)
        var labe=findViewById<TextView>(R.id.textView)
        labe.text = anwort.anwort[curent_question];
        corect_button.setOnClickListener {
            if (anwort.correct_anwort[curent_question] == true) {
                score++;
            }
            curent_question++;

            if (curent_question<number_of_questions)
            {
                labe.text = anwort.anwort[curent_question];
            }
            if (curent_question==number_of_questions){
            go_to_score();
            }
        }
        incorect_button.setOnClickListener {
            if (anwort.correct_anwort[curent_question] == false) {
                score++;
            }
            curent_question++;

            if (curent_question<number_of_questions)
            {
                labe.text = anwort.anwort[curent_question];
            }
            if (curent_question==number_of_questions){
                go_to_score();
            }
        }
    }

    private fun go_to_score() {
    //Send the score to another activity
        val intent = Intent(this, Score::class.java).putExtra("score", score)
        startActivity(intent)
    }
}