package com.example.bmi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edWeight: EditText
    lateinit var edHeight: EditText
    lateinit var bHelp: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        edWeight = findViewById(R.id.edt_weight)
        edHeight = findViewById(R.id.edt_height)
        bHelp = findViewById(R.id.calc)
        result = findViewById(R.id.result)
    }
    fun bmi(view: View) {
        val weight = edWeight.text.toString().toFloat()
        val height = edHeight.text.toString().toFloat()
        var bmi = weight / (height*height)
        result.setText(bmi.toString())
        Log.d("MainActivity", "bmi: ${bmi}")
    }
}
