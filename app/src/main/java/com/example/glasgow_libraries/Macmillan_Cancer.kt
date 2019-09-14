package com.example.glasgow_libraries

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_macmillan__cancer.*

class Macmillan_Cancer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_macmillan__cancer)


        // this is the back button
      btn_back.setOnClickListener{
          var intent = Intent (this , MainActivity :: class.java)
          startActivity(intent)
      }

        // this button allow user get back quickely home page
        btn_home.setOnClickListener{
            var intent_home = Intent(this , MainActivity:: class.java)
            startActivity(intent_home)
        }

    }
}
