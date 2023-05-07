package com.example.day22project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArraylist : ArrayList<user>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//step 1 : creating the data
        val name = arrayOf("VIrat Kohli","MS Dhoni","AB De Villiers","Md. SIraj","Rohit Sharma")

        val lastmsg = arrayOf("Hey yeah I am Good","Hey what's up ", "What are you doing man","Miyaan Magic ","I am fine ")

        val lastmsgtime = arrayOf("10:32 PM","9:48 PM","7:03 PM","2:17 PM","11:27 AM")

        val phone = arrayOf("8973459283","9526193481","8823650127","9594375360","7875814970")

        val imgid = intArrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3, R.drawable.pic4,R.drawable.pic5)

        userArraylist = ArrayList()

//pushing data into the array by using the separate class
        for (eachindex in name.indices){
            val user = user(name[eachindex], lastmsg[eachindex], lastmsgtime[eachindex], phone[eachindex],imgid[eachindex])

            userArraylist.add(user)
        }

        val listview = findViewById<ListView>(R.id.listview)
        listview.isClickable = true

//creating connection between adapter and listview
        listview.adapter = Myadapterr(this,userArraylist)

        listview.setOnItemClickListener { adapterView, view, i, l ->

            val name = name[i]
            val phonon = phone[i]
            val imgid = imgid[i]

            val intent = Intent(this,useractivity::class.java)

            intent.putExtra("name",name)
            intent.putExtra("Phone",phonon)
            intent.putExtra("imgid",imgid)
            startActivity(intent)


        }
    }
}