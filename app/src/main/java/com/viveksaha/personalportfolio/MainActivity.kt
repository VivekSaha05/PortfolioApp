package com.viveksaha.personalportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val github = findViewById<ImageView>(R.id.github)
        github.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/viveksaha05"))
            startActivity(intent)
        }
        val insta = findViewById<ImageView>(R.id.insta)
        insta.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/vivek_saiyan"))
            startActivity(intent)
        }
        val linkedin = findViewById<ImageView>(R.id.linkedin)
        linkedin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/viveksaha05"))
            startActivity(intent)
        }
        val gmail = findViewById<ImageView>(R.id.gmail)
        gmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:viveksahapop@gmail.com"))
            startActivity(intent)
        }
        val twitter = findViewById<ImageView>(R.id.twitter)
        twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Vivek_Saha2"))
            startActivity(intent)
        }
        val facebook = findViewById<ImageView>(R.id.facebook)
        facebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/viveksaha05"))
            startActivity(intent)
        }
        val whatsapp = findViewById<ImageView>(R.id.whatsapp)
        whatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/+919337113804"))
            startActivity(intent)
        }
        val telegram = findViewById<ImageView>(R.id.telegram)
        telegram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Vivek_Saha"))
            startActivity(intent)
        }
        val youtube = findViewById<ImageView>(R.id.youtube)
        youtube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/c/VivekSaha?sub_confirmation=1"))
            startActivity(intent)
        }
        val share = findViewById<ImageView>(R.id.share)
        share.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://linktr.ee/viveksaha"))
            startActivity(intent)
        }
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://viveksaha.netlify.app"))
            startActivity(intent)
        }
    }
}