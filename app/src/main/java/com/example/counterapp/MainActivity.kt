package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter: TextView =findViewById(R.id.value)
        val add: Button =findViewById(R.id.plusBtn)
        val subtract: Button=findViewById(R.id.minusBtn)

        counter.text=""+count

        add.setOnClickListener {
            counter.text=""+ ++count
        }

        subtract.setOnClickListener {
            counter.text=""+ --count

        }

    }
}