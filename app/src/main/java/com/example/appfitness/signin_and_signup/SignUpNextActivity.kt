package com.example.appfitness.signin_and_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.databinding.ActivitySignUpNextBinding
import com.example.appfitness.objects.ColorNotificationBarWhite

class SignUpNextActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)

        binding.btnNext.setOnClickListener {
            val name = intent.getStringExtra("NAME")
            val lastName = intent.getStringExtra("LAST_NAME")
            val intent = Intent(this, Wiyg1Activity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LAST_NAME", lastName)
            startActivity(intent)
            }
        }
    }
