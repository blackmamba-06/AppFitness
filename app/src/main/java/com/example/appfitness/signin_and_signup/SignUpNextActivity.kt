package com.example.appfitness.signin_and_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.databinding.ActivitySignInNextBinding
import com.example.appfitness.objects.ColorNotificationBarWhite

class SignUpNextActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)
    }
}