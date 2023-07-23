package com.sev7en.quizapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.sev7en.quizapp.R
import com.sev7en.quizapp.helper.Q_data

class QuizQuestions : AppCompatActivity() {

    private var pagerList = arrayListOf<Q_data>(
        Q_data("", "", "", "", "", ""),
        Q_data("", "", "", "", "", ""),
        Q_data("", "", "", "", "", "")
    )

    lateinit var viewpager : ViewPager2
    lateinit var btn_previous : Button
    lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        viewpager = findViewById(R.id.viewpager)
        btn_previous = findViewById(R.id.btn_previous)
        btn_next = findViewById(R.id.btn_next)



    }
}