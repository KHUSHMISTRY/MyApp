package com.mememaker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class TemplatesPage : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_templatespage)

        val drakebutton = findViewById<Button>(R.id.draketemplatebutton)

        drakebutton.setOnClickListener {

            Toast.makeText(this, "Taking to drake template", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DrakeTemplatePage::class.java)
            startActivity(intent)
            finish()
        }

    }
}
