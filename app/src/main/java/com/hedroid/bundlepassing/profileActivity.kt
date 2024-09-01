package com.hedroid.bundlepassing

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() { // Updated class name to follow naming conventions
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nameEditText = findViewById<EditText>(R.id.name)
        val fatherNameEditText = findViewById<EditText>(R.id.fatherName)
        val rollNoEditText = findViewById<EditText>(R.id.rollNo)
        val phoneNoEditText = findViewById<EditText>(R.id.phoneNo)

        val intent = intent
        val name = intent.getStringExtra("name")
        val fatherName = intent.getStringExtra("fatherName")
        val rollNo = intent.getStringExtra("rollNo")
        val phoneNo = intent.getStringExtra("phoneNo")

        nameEditText.setText("Name : $name")
        fatherNameEditText.setText("Father's Name : $fatherName")
        rollNoEditText.setText("Roll No : $rollNo")
        phoneNoEditText.setText("Phone No : $phoneNo")
    }
}

