package com.example.cardtam

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tamcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val tamcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        tamcardQuestion.setOnClickListener {
            tamcardQuestion.visibility = View.INVISIBLE
            tamcardAnswer.visibility = View.VISIBLE

        }
    }
}