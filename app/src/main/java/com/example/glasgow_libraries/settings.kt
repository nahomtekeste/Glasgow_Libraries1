package com.example.glasgow_libraries

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_settings.*

class settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

            // this button allow the user get back quick
        btn_back.setOnClickListener{
            var intent = Intent(this , MainActivity:: class.java)
            startActivity(intent)
        }
        // this button allow the user to get back very quick
        btn_home.setOnClickListener{
            var intent = Intent (this , MainActivity::class.java)
            startActivity(intent)
        }

        // Notification allow the user
        // this button allow the app get notifications

        var notificationManager =getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager
        var id = " Channel_01"
        var name = " Defult_Channel"
        var important =  NotificationManager.IMPORTANCE_HIGH
        var channels = NotificationChannel(id,name , important)
        channels.lightColor = Color.CYAN

        notificationManager.createNotificationChannel(channels)


        btn_notify.setOnClickListener{
            var ncbuilder = NotificationCompat.Builder(this , " Channel_01")
            ncbuilder.setSmallIcon(R.drawable.notification_icon_background)
            ncbuilder.setContentTitle(" Notification ")
            ncbuilder.setContentText("This is the best notification allow the user ")

            val mNoficiationManager =
                getSystemService(Context.NOTIFICATION_SERVICE)
                        as NotificationManager

            mNoficiationManager.notify(1, ncbuilder.build())

        }

    }
}
