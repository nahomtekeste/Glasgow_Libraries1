package com.example.glasgow_libraries

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_event_calender.*

class event_calender : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_calender)

        // this is button allow us to  return back to the main activity

        btn_back.setOnClickListener{
            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        // this buttoon allow the user to get back to home page very fast
        btn_home.setOnClickListener{
            var intent = Intent(this , MainActivity :: class.java)
            startActivity(intent)
        }


    }


}
