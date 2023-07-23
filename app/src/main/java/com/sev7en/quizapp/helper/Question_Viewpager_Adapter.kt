package com.sev7en.quizapp.helper

import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sev7en.quizapp.R
import java.util.ArrayList

class Question_Viewpager_Adapter(activity : FragmentActivity, private val question_list : ArrayList<Q_data>) : FragmentStateAdapter(activity)
{

    override fun getItemCount(): Int {
        return question_list.size
    }

    override fun createFragment(position: Int): Fragment {
        return QuestionsFragment(question_list[position])
    }

}