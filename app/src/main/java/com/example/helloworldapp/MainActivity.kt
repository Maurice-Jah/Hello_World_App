package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         activity()



    }
    private fun activity(){
        var count = 0
        val increment = findViewById<Button>(R.id.btn_increment)
        val display = findViewById<TextView>(R.id.increment_textView)

        var action = increment.setOnClickListener{
            count++
            display.text = count.toString()
        }
    }


}

