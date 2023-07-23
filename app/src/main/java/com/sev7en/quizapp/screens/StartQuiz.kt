package com.sev7en.quizapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sev7en.quizapp.databinding.ActivityStartQuizBinding

class StartQuiz : AppCompatActivity() {

    private lateinit var binding: ActivityStartQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_start_quiz)
        binding = ActivityStartQuizBinding.inflate(layoutInflater);
        setContentView(binding.root);

        binding.btnStartQuiz.setOnClickListener {
            startActivity(Intent (this, QuizQuestions::class.java))
        }
    }
}