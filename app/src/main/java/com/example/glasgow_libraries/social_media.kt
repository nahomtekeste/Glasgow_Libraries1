package com.example.glasgow_libraries

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_social_media.*

class social_media : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        // this is helps the user get back
        btn_back.setOnClickListener{
            var intent = Intent(this , MainActivity ::class.java)
            startActivity(intent)
        }

        // this button allows the user get back home very fast
        btn_home.setOnClickListener{
            var intent = Intent(this , MainActivity :: class.java)
            startActivity(intent)
        }
        // this button allow the user to get intouch with the social media face book
        btn_facebook.setOnClickListener{
            var intentfacebook = Intent( Intent.ACTION_VIEW,Uri.parse("facebook.com"))
            startActivity(intentfacebook)
        }
        // thia button allow the user to connect with tiwter.com
        btn_Twiter.setOnClickListener{
            var intenttiwiter = Intent(Intent.ACTION_VIEW,Uri.parse("http://tiwter.com"))
            startActivity(intenttiwiter)
        }
        // this button allow the user to connect with instegram

        btn_instegram.setOnClickListener{
            var intentinstegram = Intent(Intent.ACTION_VIEW,Uri.parse("http://instegram.com"))
            startActivity(intentinstegram)
        }

    }
}
