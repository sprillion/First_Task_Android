package com.sprill.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SquareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        var count: Int = 0
        val squareText = findViewById<TextView>(R.id.squareText)
        if (intent != null)
            count = intent.getIntExtra(MainActivity.BUNDLE_KEY_COUNT, 1)

        squareText.text = (count * count).toString()

        Log.d(this.localClassName, "Created")
    }

    override fun onStart() {
        Log.d(this.localClassName, "Started")
        super.onStart()
    }

    override fun onPause() {
        Log.d(this.localClassName, "Paused")
        super.onPause()
    }

    override fun onResume() {
        Log.d(this.localClassName, "Resumed")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d(this.localClassName, "Destroyed")
        super.onDestroy()
    }

    override fun onStop() {
        Log.d(this.localClassName, "Stopped")
        super.onStop()
    }
}