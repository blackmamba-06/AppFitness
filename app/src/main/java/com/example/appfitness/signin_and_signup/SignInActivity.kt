package com.example.appfitness.signin_and_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.R
import com.example.appfitness.databinding.ActivitySignInBinding
import com.example.appfitness.databinding.ActivitySignUpBinding
import com.example.appfitness.objects.ButtonsNavigation
import com.example.appfitness.objects.ColorNotificationBarWhite

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)
        binding.tvRegister.setOnClickListener {
            ButtonsNavigation.nextAcitivity(this, SignUpActivity::class.java)
        }
    }
}