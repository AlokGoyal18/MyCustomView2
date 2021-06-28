package com.example.mycustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var click=0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView = TextView(this)
//        textView.text = "Hello Custom Views"
//        textView.textSize=20F
//        setContentView(textView)

        val emotionalFaceView=findViewById<EmotionalFaceView>(R.id.emotionalFaceView)
        val sadButton=findViewById<EmotionalFaceView>(R.id.happyButton)
        val happyButton=findViewById<EmotionalFaceView>(R.id.sadButton)

        happyButton.setOnClickListener {
            emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        }
// 2
        sadButton.setOnClickListener {
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
        }



    }
}