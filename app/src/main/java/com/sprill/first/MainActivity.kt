package com.sprill.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    private var count = 0
    private var counterText: TextView? = null
    companion object {
        const val BUNDLE_KEY_COUNT = "count"
        const val BUNDLE_KEY_SAVE_COUNT = "saveCount"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.counetrText)
        val buttonSquare = findViewById<Button>(R.id.buttonSquare)
        buttonSquare.setOnClickListener {
            openSquareActivity()
        }
        showText()
        Log.d(this.localClassName, "Created")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(BUNDLE_KEY_SAVE_COUNT, count)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        count = savedInstanceState.getInt(BUNDLE_KEY_SAVE_COUNT)
        count++
        showText()
        super.onRestoreInstanceState(savedInstanceState)
    }

    private fun showText() {
        counterText?.text = count.toString()
    }

    private fun openSquareActivity(){
        val intent = Intent(this, SquareActivity::class.java).apply {
            putExtra(BUNDLE_KEY_COUNT, count)
        }
        startActivity(intent)
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
    /*
    ООООООООООЧЕНЬ МНОГО КОДА
     */
}