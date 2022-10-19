package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private var firstOperator = 0.0
    private var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = this.findViewById(R.id.resultTextView)
    }
    fun numberClick(clickedView: View){
        if(clickedView is Button){

            var result = resultTextView.text.toString()
//            moinishna pirveli ricxvi

            var buttonNumber = clickedView.text.toString()
//            vigebt ricxsvs buttonidan

            if (result == "0"){
                result =""

                var res = result + buttonNumber
//            vumatebt marjvena mxares

                resultTextView.text = res
//            gamogvaq ekranze


            }
        }
    }
    fun operationClick(clickedView: View){
        if(clickedView is Button){
            var firstNumber = resultTextView.text.toString()
            if(firstNumber.isNotEmpty()){
                firstOperator = firstNumber.toDouble()
            }
            this.operation = clickedView.text.toString()
            resultTextView.text = ""

        }
    }
    fun equalsClick(clickedView: View){
        if(clickedView is Button){
            var secondNumber = resultTextView.text
            var sn = 0.0
            if(secondNumber.isNotEmpty()){
//                sn = secondNumber.toDouble()
            }
            when(operation){
                "+" -> resultTextView.text = (firstOperator + sn).toString()
                "-" -> resultTextView.text = (firstOperator - sn).toString()
                "*" -> resultTextView.text = (firstOperator * sn).toString()
                "/" -> resultTextView.text = (firstOperator / sn).toString()
                "%" -> resultTextView.text = ((firstOperator / sn) * 100 ) .toString()
                "√" -> resultTextView.text = sqrt(firstOperator).toString()

            }
        }
    }
}