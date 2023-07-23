package com.sev7en.quizapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.sev7en.quizapp.R
import com.sev7en.quizapp.helper.Q_data
import com.sev7en.quizapp.helper.Question_Viewpager_Adapter

class QuizQuestions : AppCompatActivity() {

    var points = 0

    fun setPoints (point : Int) {
        this.points = point
    }

    fun getPoints () : Int {
        return this.points
    }

    private val onQuizQuestionPageChangeCallBack = object : ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
        }
    }

    private var pagerList = arrayListOf<Q_data>(
        Q_data("name", "a", "b", "c", "d", "a")
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

        viewpager.apply {
            adapter = Question_Viewpager_Adapter(this@QuizQuestions, pagerList)
            registerOnPageChangeCallback(onQuizQuestionPageChangeCallBack)
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }

        viewpager.currentItem

        btn_next.setOnClickListener {
            if (viewpager.currentItem < viewpager.adapter!!.itemCount - 1) {
                viewpager.currentItem += 1
            } else if (viewpager.currentItem == viewpager.adapter!!.itemCount - 1){
                startActivity(Intent(this, Result_Screen::class.java))
                finish()
            }
        }
        btn_previous.setOnClickListener {
            if (viewpager.currentItem > 0) {
                viewpager.currentItem -= 1
            } else if (viewpager.currentItem == 0) {
                startActivity(Intent(this, StartQuiz::class.java))
                finish()
            }
        }

    }
}