package com.example.findmyage_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener()
        {
            buttonClick()
        }
    }

    private fun buttonClick() {
        //run when button is clicked
        val userDOB = Integer.parseInt(editDate.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears = currentYear - userDOB
        textAgeDisplay.text = "Your age is $userAgeInYears Years"
    }
}