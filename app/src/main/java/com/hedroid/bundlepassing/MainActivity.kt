package com.hedroid.bundlepassing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val fatherName = findViewById<EditText>(R.id.fatherName)
        val rollNo = findViewById<EditText>(R.id.rollNo)
        val phoneNo = findViewById<EditText>(R.id.phoneNo)
        val button = findViewById<Button>(R.id.GotonextActvity)

        button.setOnClickListener {
            val name = name.text.toString()
            val fatherName = fatherName.text.toString()
            val rollNo = rollNo.text.toString()
            val phoneNo = phoneNo.text.toString()
            val profileActivity = Unit
            val intent = Intent(this,profileActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("fatherName",fatherName)
            intent.putExtra("rollNo",rollNo)
            intent.putExtra("phoneNo",phoneNo)
            startActivity(intent)

        }

    }
}
