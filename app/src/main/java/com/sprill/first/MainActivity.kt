package com.sprill.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    private var count = 0
    private var counterText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.counetrText)
        ShowText()
        Log.d(this.localClassName, "Created")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("count", count)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        count = savedInstanceState.getInt("count")
        count++
        ShowText()
        super.onRestoreInstanceState(savedInstanceState)
    }

    private fun ShowText()
    {
        counterText?.setText(count.toString())
    }

    public fun buttonSquare(view: View){
        val intent = Intent(this, SquareActivity::class.java).apply {
            putExtra("count", count)
        }
        startActivity(intent)
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