package com.shahnoza.spinner.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.shahnoza.spinner.R

class MyAdapter(var context: Context,var list:ArrayList<String>,var myClick: MyClick):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
         return list[position]
    }

    override fun getItemId(position: Int): Long {
         return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      var itemView:View
    if (convertView==null){
        itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item,parent,false)

    }else{
        itemView = convertView
    }
    itemView.findViewById<TextView>(R.id.itemText).text = list[position]

    itemView.setOnClickListener {
        myClick.clickMe(list[position],position)
    }


    return itemView
    }

    interface MyClick{
        fun clickMe(color:String,position: Int)
    }

}