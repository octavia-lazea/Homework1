package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("create", "created activity A")
    }

    fun startB(view: View) {
        val intent = Intent(this, ActivityB::class.java)
        startActivity(intent)
    }

    fun startC(view: View) {
        val intent = Intent(this, ActivityC::class.java)
        startActivityForResult(intent, 7)
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "stopped activity A")
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "started activity A")
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume", "resumed activity A")
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "paused activity A")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 7) {
            val message: String? = data?.getStringExtra("MESSAGE")
            Log.d("message from C", message!!)
            //Log.d("message from C", resultCode.toString())
        }
        if (requestCode == 5){
            val result: String? = data?.getStringExtra("RESULT")
            Log.d("result from C", result!!)
        }
    }

    fun sendToC(view: View){
        val intent = Intent(this, ActivityC::class.java)
        val s = findViewById<EditText>(R.id.stringInput).text.toString()
        val i = findViewById<EditText>(R.id.integerInput).text.toString()
        intent.putExtra("INTEGER", i)
        intent.putExtra("STRING", s)
        startActivityForResult(intent, 5)

    }


}