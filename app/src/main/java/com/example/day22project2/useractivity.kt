package com.example.day22project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class useractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_useractivity)

        val name = intent.getStringExtra("name")
        val phonenumber = intent.getStringExtra("Phone")
        val imgid = intent.getIntExtra("imgid",R.drawable.pic1)

        val nametv = findViewById<TextView>(R.id.tvname)
        val phonetv = findViewById<TextView>(R.id.tvphone)
        val imgtv = findViewById<CircleImageView>(R.id.profile_image)

        nametv.text = name
        phonetv.text = phonenumber
        imgtv.setImageResource(imgid)

    }
}