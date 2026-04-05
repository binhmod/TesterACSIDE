package com.example.myempty.myemptyactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {
    while (true) {
        val time = System.currentTimeMillis()
        Log.d("APP", "[$time] Log test")
        Thread.sleep(100)
    }
}.start()
    }
}