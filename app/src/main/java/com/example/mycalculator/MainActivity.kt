package com.example.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvMine:TextView
    lateinit var tilNum1: TextInputLayout
    lateinit var tilNum2: TextInputLayout
    lateinit var tvResult: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etNum1: TextInputEditText
    lateinit var etNum2: TextInputEditText

    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()

    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener {
            addition()
        }
        btnSubtract.setOnClickListener {
            subtraction()
        }
        btnMultiply.setOnClickListener {
            multiplication()
        }
        btnModulus.setOnClickListener {
            modulus()
        }
    }
    fun castViews(){
        tvMine = findViewById(R.id.tvMine)
        tilNum1 = findViewById(R.id.tilNUm1)
        tilNum2 = findViewById(R.id.tilNum2)
        tvResult = findViewById(R.id.tvResult)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
    }
    fun addition(){
        val num1=etNum1.text.toString().toDouble()
        val num2=etNum2.text.toString().toDouble()
        val answer=num1+num2
        tvResult.text=answer.toString()
    }
    fun subtraction(){
        val num1=etNum1.text.toString().toDouble()
        val num2=etNum2.text.toString().toDouble()
        val answer=num1-num2
        tvResult.text=answer.toString()
    }
    fun multiplication(){
        val num1=etNum1.text.toString().toDouble()
        val num2=etNum2.text.toString().toDouble()
        val answer=num1*num2
        tvResult.text=answer.toString()
    }
    fun modulus(){
        val num1=etNum1.text.toString().toDouble()
        val num2=etNum2.text.toString().toDouble()
        val answer=num1%num2
        tvResult.text=answer.toString()
    }

}