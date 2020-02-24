package com.example.adshion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
val mainActivity = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(mainActivity,"onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i(mainActivity,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(mainActivity,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(mainActivity,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(mainActivity,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(mainActivity,"onDestroy")
    }
    fun operatorPles(view: View){
        var num1 = etInput1.text.toString().toDouble()
        var num2 = etInput2.text.toString().toDouble()
        var output = num1 + num2
        tvOutput.text=output.toString();

    }fun operatormines(view: View){
        var num1 = etInput1.text.toString().toDouble()
        var num2 = etInput2.text.toString().toDouble()
        var output = num1 - num2
        tvOutput.text=output.toString();

    }fun operatorDived(view: View){
        var num1 = etInput1.text.toString().toDouble()
        var num2 = etInput2.text.toString().toDouble()
        var output = num1 / num2
        tvOutput.text=output.toString();

    }fun operatorMutepyt(view: View){
        var num1 = etInput1.text.toString().toDouble()
        var num2 = etInput2.text.toString().toDouble()
        var output = num1 * num2
        tvOutput.text=output.toString();

    }





}






