package com.example.appfitness.signin_and_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.databinding.ActivityWiyg2Binding
import com.example.appfitness.objects.ColorNotificationBarWhite

class Wiyg2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityWiyg2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWiyg2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)
        binding.btnConfirm2.setOnClickListener {
            val name = intent.getStringExtra("NAME")
            val lastName = intent.getStringExtra("LAST_NAME")
            val intent = Intent(this, Wiyg3Activity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LAST_NAME", lastName)
            startActivity(intent)
        }
    }
}