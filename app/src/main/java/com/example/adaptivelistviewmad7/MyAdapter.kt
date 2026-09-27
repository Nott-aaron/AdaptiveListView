package com.example.adaptivelistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(
    context: Context,
    private val pets: List<Pet>
) : ArrayAdapter<Pet>(context, R.layout.list_item, pets) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView
            ?: inflater.inflate(R.layout.list_item, parent, false)

        val imgIcon = view.findViewById<ImageView>(R.id.imgIcon)
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvDesc = view.findViewById<TextView>(R.id.tvDesc)
        val tvPrice = view.findViewById<TextView>(R.id.tvPrice)

        val pet = pets[position]

        imgIcon.setImageResource(pet.imageRes)
        tvName.text = pet.name
        tvDesc.text = pet.desc
        tvPrice.text = pet.price

        return view
    }
}