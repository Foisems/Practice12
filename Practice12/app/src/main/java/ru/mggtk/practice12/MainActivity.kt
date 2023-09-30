package ru.mggtk.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        val imageView1 = findViewById<ImageView>(R.id.imageView)

        val radioButton1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)

        if(radioButton1.isChecked)  imageView1.setImageResource(R.drawable.apple)
        else if(radioButton2.isChecked)  imageView1.setImageResource(R.drawable.pear)
        else imageView1.setImageResource(R.drawable.grape)
    }

    fun onCheckBoxClicked(view: View) {
        val imageView1 = findViewById<ImageView>(R.id.imageView2)
        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        val imageView3 = findViewById<ImageView>(R.id.imageView4)

        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)

        if(checkBox1.isChecked)  imageView1.visibility = View.VISIBLE
        else imageView1.visibility = View.INVISIBLE
        if(checkBox2.isChecked)  imageView2.visibility = View.VISIBLE
        else imageView2.visibility = View.INVISIBLE
        if(checkBox3.isChecked) imageView3.visibility = View.VISIBLE
        else imageView3.visibility = View.INVISIBLE
    }
}