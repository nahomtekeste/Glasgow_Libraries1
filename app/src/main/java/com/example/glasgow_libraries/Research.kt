package com.example.glasgow_libraries

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_research.*

class Research : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_research)

        // this button allow us to get back
        btn_back.setOnClickListener{
            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener{
            var intent_research = Intent(this , MainActivity ::class.java)
            startActivity(intent_research)
        }

    }
}
