package com.example.appfitness.signin_and_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.databinding.ActivityWiyg3Binding
import com.example.appfitness.objects.ColorNotificationBarWhite


class Wiyg3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityWiyg3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWiyg3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)
        val name = intent.getStringExtra("NAME")
        binding.btnConfirm3.setOnClickListener {
            val name = intent.getStringExtra("NAME")
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)
            }
        }
    }
