package com.example.day22project2

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

//crating our own adapter
class Myadapterr(val context : Activity, val arrayList: ArrayList<user>): ArrayAdapter<user>(context,R.layout.eachrow,arrayList) {

    @SuppressLint("ViewHolder")
    //crating view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachrow,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tvname)
        val lastmsg = view.findViewById<TextView>(R.id.tvmessage)
        val lastmsgtime = view.findViewById<TextView>(R.id.lastmsgtv)

        name.text = arrayList[position].name
        lastmsg.text = arrayList[position].lastmsg
        lastmsgtime.text = arrayList[position].lastmsgtime
        image.setImageResource(arrayList[position].imageid)

        return view
    }
}