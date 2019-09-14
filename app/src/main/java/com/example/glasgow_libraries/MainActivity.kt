package com.example.glasgow_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.content.Context
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent1


class MainActivity : AppCompatActivity() {

    var countries: MutableList<String> = ArrayList()
    var displayList: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // this is search buuton
        btn_search.setOnClickListener {
            var intent = Intent1(this, Search_Activity::class.java)
            startActivity(intent)
        }


        // code for the event button
        btn_event.setOnClickListener{
            var inten = Intent1(this , event_calender :: class.java)
        }

        // this code allo new user to create their owen account
        btn_accont.setOnClickListener{
            var intent = Intent1(this , Acccont::class.java)
            startActivity(intent)
        }

        // this is the allow the user to share thing to the world through social media
        btn_social.setOnClickListener{
            var intent = Intent1(this , social_media ::class.java)
            startActivity(intent)
        }

        // this is button allow  the user to find the neareset libraries
        btn_local_find.setOnClickListener{
            var intent = Intent1(this ,find_local ::class.java)
            startActivity(intent)
        }



    }
}


