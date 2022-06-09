package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }

    fun createbirthdaycard(view: View) {
        val  name=nameinput.editableText.toString()
        Toast.makeText(this, "Wishing $name a Happy Birthday",Toast.LENGTH_LONG).show()
        val intent=Intent(this, BirthdayGreetingActivity::class.java)
        startActivity(intent)
    }



}
