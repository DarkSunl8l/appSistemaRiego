package com.example.unknowntwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar?.hide()


        val btnAboutUs = findViewById<Button>(R.id.btnAboutUs)

        btnAboutUs.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        })
    }
}