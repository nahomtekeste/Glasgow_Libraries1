package com.example.glasgow_libraries

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_acccont.*
import kotlinx.android.synthetic.main.activity_find_local.*

class find_local : AppCompatActivity() {

    var location = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_local)

            // this button is allow the user to see the location of the of that specific place castlemilk libraries
     btn_brithishlibrary.setOnClickListener{
         location.clear()

         var builder = AlertDialog.Builder(this)
         var place = arrayOf("Opening hour " , " Mon: 10am - 5pm" , "Tue 10am - 5pm"
             , " Wed : 10am - 5pm" , " Thur : 10am - 5pm " , "Fri: 10 am- 5pm" , "Location Castlmilk Street")
         builder.setTitle("About Us ")
         builder.setMultiChoiceItems(place , null , DialogInterface.OnMultiChoiceClickListener{
                 dailog , which, isChecked ->
             if(isChecked){
                 location.add(place[which])
             }else if(
                 location.contains(place[which]))
                 location.remove(place[which])
         })
         builder.setPositiveButton("Selected " , DialogInterface.OnClickListener{
                 dialog , id ->
             var s: String = " "
             for(i in 0 until location.size){
                 s += " " + location
             }
             txt_books.text = s

         })
         builder.setNegativeButton("Concel " , DialogInterface.OnClickListener{
                 dialog , id->
             location.clear()
         })
         builder.create()
         builder.show()
     }

        // this button is allow the user to see the location of the of that specific place couper libraries
        btn_couper.setOnClickListener{
            location.clear()

            var builder = AlertDialog.Builder(this)
            var place = arrayOf("Opening hour " , " Mon: 10am - 5pm" , "Tue 10am - 5pm"
                , " Wed : 10am - 5pm" , " Thur : 10am - 5pm " , "Fri: 10 am- 5pm" , "Location couper Street")
            builder.setTitle("About Us ")
            builder.setMultiChoiceItems(place , null , DialogInterface.OnMultiChoiceClickListener{
                    dailog , which, isChecked ->
                if(isChecked){
                    location.add(place[which])
                }else if(
                    location.contains(place[which]))
                    location.remove(place[which])
            })
            builder.setPositiveButton("Selected " , DialogInterface.OnClickListener{
                    dialog , id ->
                var s: String = " "
                for(i in 0 until location.size){
                    s += " " + location
                }
                txt_books.text = s

            })
            builder.setNegativeButton("Concel " , DialogInterface.OnClickListener{
                    dialog , id->
                location.clear()
            })
            builder.create()
            builder.show()
        }

        // this button also allow the user to see the loaction of the place about mitchel libraries
        btn_mitchel.setOnClickListener{
            location.clear()

            var builder = AlertDialog.Builder(this)
            var place = arrayOf("Opening hour " , " Mon: 10am - 5pm" , "Tue 10am - 5pm"
                , " Wed : 10am - 5pm" , " Thur : 10am - 5pm " , "Fri: 10 am- 5pm" , "Location Mitchel Street")
            builder.setTitle("About Us ")
            builder.setMultiChoiceItems(place , null , DialogInterface.OnMultiChoiceClickListener{
                    dailog , which, isChecked ->
                if(isChecked){
                    location.add(place[which])
                }else if(
                    location.contains(place[which]))
                    location.remove(place[which])
            })
            builder.setPositiveButton("Selected " , DialogInterface.OnClickListener{
                    dialog , id ->
                var s: String = " "
                for(i in 0 until location.size){
                    s += " " + location
                }
                txt_books.text = s

            })
            builder.setNegativeButton("Concel " , DialogInterface.OnClickListener{
                    dialog , id->
                location.clear()
            })
            builder.create()
            builder.show()
        }
    }

}
