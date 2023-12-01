package com.example.pr_8_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bind()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("textfield", findViewById<TextView>(R.id.AnswerTextView).text.toString())
            putString("input1", findViewById<EditText>(R.id.aTextNumber).text.toString())
            putString("input2", findViewById<EditText>(R.id.bTextNumber).text.toString())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        findViewById<TextView>(R.id.AnswerTextView).text = savedInstanceState.getString("textfield", "")
        findViewById<EditText>(R.id.aTextNumber).setText(savedInstanceState.getString("input1", ""))
        findViewById<EditText>(R.id.bTextNumber).setText(savedInstanceState.getString("input2", ""))
    }
    fun Bind() {
        val button = findViewById<Button>(R.id.SolutionButton)
        button.setOnClickListener(::handleButtonClick)
    }

    private fun handleButtonClick(view: View?) {
        val a = findViewById<EditText>(R.id.aTextNumber).text.toString().toDoubleOrNull()
        val b = findViewById<EditText>(R.id.bTextNumber).text.toString().toDoubleOrNull()
        val AnswerText = findViewById<TextView>(R.id.AnswerTextView)
        if (a != null && b != null)
            AnswerText.text = MakeSolution(a,b)
        else findViewById<TextView>(R.id.AnswerTextView).text = "Ошибка!"
    }
    private fun MakeSolution(a : Double, b : Double):String {
        return if (a == 0.0) {
            if (b >= 0.0) {
                val c = "Множество значений"
                return c
            } else {
                val c = "Нет решений"
                return c
            }
        } else if (a > 0.0) {
            var res = -b / a
            if (res.isFinite())
                "x >= ${res}"
            else {
                val c = "Переаполнение"
                return c
            }
        } else {
            var res = -b / a
            if (res.isFinite())
                "x <= ${res}"
            else {
                val c = "Переаполнение"
                return c
            }
        }
    }
}