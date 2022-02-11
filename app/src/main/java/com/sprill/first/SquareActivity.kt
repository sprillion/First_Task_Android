package com.sprill.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        val i = intent
        var count: Int = 0
        val squareText = findViewById<TextView>(R.id.squareText)

        if (i != null)
            count = i.getIntExtra("count", 1)
        count *= count
        squareText.setText(count.toString())

        Log.d(this.localClassName, "Created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this.localClassName, "Started")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this.localClassName, "Paused")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this.localClassName, "Resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this.localClassName, "Destroyed")
    }

    override fun onStop() {
        super.onStop()
        Log.d(this.localClassName, "Stopped")
    }
}