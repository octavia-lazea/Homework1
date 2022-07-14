package com.example.homework1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("create", "created activity B")
    }

    fun openLink(view: View){
        val url = "https://developer.android.com/reference/android/content/Intent"
        val intentWeb = Intent(Intent.ACTION_VIEW)
        intentWeb.data = Uri.parse(url)
        startActivity(intentWeb)
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "stopped activity B")
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "started activity B")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "resumed activity B")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "paused activity B")
    }

}