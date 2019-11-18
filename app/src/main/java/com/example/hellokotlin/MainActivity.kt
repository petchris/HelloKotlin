package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strings = arrayOf("one", "four")
        println(strings[1])

        doSomething()

        Log.d( TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d( TAG , "onStart")
    }

    fun doSomething() {
        println("Hello")
    }

    override fun onResume() {
        super.onResume()
        Log.d( TAG , "onResume")
    }
}
