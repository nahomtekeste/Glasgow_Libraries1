package com.example.glasgow_libraries

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_acccont.*

class Acccont : AppCompatActivity() {
    var currentload = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acccont)

        // this is button allow us to  return back to the main activity
        btn_back.setOnClickListener{
            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
        // this button allow the user to get back home page very quaily
        btn_home.setOnClickListener{
            var intent = Intent(this , MainActivity ::class.java)
            startActivity(intent)
        }

       // this code is allow the user see what are the current loads books
        btn_currentload.setOnClickListener{
          currentload.clear()
            var builder = AlertDialog.Builder(this)
             val books = arrayOf("7 habbits of highly effective people " ,
                 " Rich dad - Poor dad " , "The power of postive thinking" , " The power of Repitation",
                 " The power of self confidence " , " The secrit power of lists" , " You do Know")
            builder.setTitle("Current Loans")
            builder.setMultiChoiceItems(books , null , DialogInterface.OnMultiChoiceClickListener{

                dailog , which, isChecked ->
                if(isChecked){
                    currentload.add(books[which])
                }else if(
                    currentload.contains(books[which]))
                    currentload.remove(books[which])
            })
            builder.setPositiveButton("Selected" ,
                DialogInterface.OnClickListener{
                dailog , id ->
                    var s: String = " "
                    for(i in 0 until currentload.size) {
                        s += " " + currentload
                    }
                    txt_books.text = s
            })
            builder.setNegativeButton("Concel" , DialogInterface.OnClickListener{
                dailog , id ->
                currentload.clear()
            })
            builder.create()
            builder.show()


        }


        // this code allow the user to show up the reserved books
        btn_reservation.setOnClickListener{
            currentload.clear()
            var builder = AlertDialog.Builder(this)
            val books = arrayOf("7 habbits of highly effective people " ,
                " Rich dad - Poor dad " , "The power of postive thinking" , " The power of Repitation",
                " The power of self confidence " , " The secrit power of lists" , " You do Know")
            builder.setTitle("Current Loans")
            builder.setMultiChoiceItems(books , null , DialogInterface.OnMultiChoiceClickListener{

                    dailog , which, isChecked ->
                if(isChecked){
                    currentload.add(books[which])
                }else if(
                    currentload.contains(books[which]))
                    currentload.remove(books[which])
            })
            builder.setPositiveButton("Selected" ,
                DialogInterface.OnClickListener{
                        dailog , id ->
                    var s: String = " "
                    for(i in 0 until currentload.size) {
                        s += " " + currentload
                    }
                    txt_books.text = s
                })
            builder.setNegativeButton("Concel" , DialogInterface.OnClickListener{
                    dailog , id ->
                currentload.clear()
            })
            builder.create()
            builder.show()


        }

        // this code allow  the user to use how much charge is their in their account
        btn_charge.setOnClickListener{
               var builder = AlertDialog.Builder(this)
               builder.setMessage("Your Do not have any Current Charges")
               builder.setPositiveButton("OK" , DialogInterface.OnClickListener{
                   dailog , id ->

               })
            builder.setNegativeButton("Cancel " , DialogInterface.OnClickListener{
                dailog , id ->
            } )
            builder.create()
            builder.show()

        }
    }
}
