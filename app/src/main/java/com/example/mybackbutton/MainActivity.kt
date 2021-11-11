package com.example.mybackbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mStartActBtn = findViewById<Button>(R.id.startActBtn)
        mStartActBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, NewActivity::class.java))
        }
        }

    }

