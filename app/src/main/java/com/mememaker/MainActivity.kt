package com.mememaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val templatebutton = findViewById<Button>(R.id.templates)

        templatebutton.setOnClickListener{

            Toast.makeText(this,"Taking to template pages",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,TemplatesPage::class.java)
            startActivity(intent)
            finish()
        }



        }
    }

