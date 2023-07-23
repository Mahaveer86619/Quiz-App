package com.sev7en.quizapp.helper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.sev7en.quizapp.R
import com.sev7en.quizapp.screens.QuizQuestions

class QuestionsFragment(val Q_data: Q_data) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_questions, container, false)

        val question = view.findViewById<TextView>(R.id.tv_question)
        val radio_grp = view.findViewById<RadioGroup>(R.id.radio_grp)
        val rad_btn1 = view.findViewById<RadioButton>(R.id.radio_btn1)
        val rad_btn2 = view.findViewById<RadioButton>(R.id.radio_btn2)
        val rad_btn3 = view.findViewById<RadioButton>(R.id.radio_btn3)
        val rad_btn4 = view.findViewById<RadioButton>(R.id.radio_btn4)

        question.text = Q_data.question
        rad_btn1.text = Q_data.option_1
        rad_btn2.text = Q_data.option_2
        rad_btn3.text = Q_data.option_3
        rad_btn4.text = Q_data.option_4

        val checked = radio_grp.checkedRadioButtonId
        val checked_btn = view.findViewById<RadioButton>(checked)

        if (checked_btn.text == Q_data.correct) {

            val curent_points : Int = (activity as QuizQuestions).getPoints()
            val update_points : Int = curent_points + 1

            (activity as QuizQuestions).setPoints(update_points)
        }

        return view
    }

}