package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityC: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d("create", "created activity C")
    }

    fun clickOk(view: View){
        val intent = Intent()
        intent.putExtra("MESSAGE", "OK")
        setResult(7, intent)
        finish()
    }

    fun clickCancel(view: View){
        val intent = Intent()
        intent.putExtra("MESSAGE", "CANCEL")
        setResult(7, intent)
        finish()
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "stopped activity C")
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "started activity C")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "resumed activity C")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "paused activity C")
    }

    fun concatenate(view: View){
        val intent = Intent()
        val i: String? = getIntent().getStringExtra("INTEGER")
        val s : String? = getIntent().getStringExtra("STRING")
        val result = "$i//$s"
        intent.putExtra("RESULT", result)
        setResult(5, intent)
        finish()
    }
}