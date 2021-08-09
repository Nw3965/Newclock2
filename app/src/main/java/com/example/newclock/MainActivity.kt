package com.example.newclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*
import kotlin.concurrent.timer
import android.os.Handler
import com.example.clock.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handler = Handler( )
        timer(name = "testTimer", period = 1000) {

            val calendar = Calendar.getInstance()
            // Set hour, minute and second。
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val second = calendar.get(Calendar.SECOND)
            // Send handler to these information below.
            handler.post {
               
                val test = findViewById<TextView>(R.id.textView)
                "${hour}時${minute}分${second}秒".also { test.text = it }

            }

        }
    }
}
