package com.example.adaptivelistview

import android.app.AlertDialog
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Pet(
    val name: String,
    val desc: String,
    val price: String,
    val imageRes: Int
)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val pets = listOf(

            Pet(
                "Labrador",
                "Friendly and playful",
                "₹8,000",
                R.drawable.pet_labrador
            ),

            Pet(
                "Persian Cat",
                "Calm and affectionate",
                "₹6,000",
                R.drawable.pet_persian
            ),

            Pet(
                "Beagle",
                "Active and friendly",
                "₹7,000",
                R.drawable.pet_beagle
            ),

            Pet(
                "Rabbit",
                "Small and gentle",
                "₹2,500",
                R.drawable.pet_rabbit
            ),

            Pet(
                "Parrot",
                "Social and intelligent",
                "₹3,000",
                R.drawable.pet_parrot
            ),

            Pet(
                "Turtle",
                "Quiet and easy to maintain",
                "₹1,500",
                R.drawable.pet_turtle
            )
        )

        val listView = findViewById<ListView>(R.id.listView)

        listView.adapter = MyAdapter(this, pets)

        listView.setOnItemClickListener { _, _, position, _ ->
            showPetDialog(pets[position])
        }
    }

    private fun showPetDialog(pet: Pet) {

        val dialogView =
            layoutInflater.inflate(R.layout.dialog_pet, null)

        dialogView
            .findViewById<ImageView>(R.id.imgDialog)
            .setImageResource(pet.imageRes)

        dialogView
            .findViewById<TextView>(R.id.tvDialogName)
            .text = pet.name

        AlertDialog.Builder(this)
            .setView(dialogView)
            .setNegativeButton("CLOSE") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}