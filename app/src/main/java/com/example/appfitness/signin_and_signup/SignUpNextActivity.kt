package com.example.appfitness.signin_and_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.databinding.ActivitySignUpNextBinding
import com.example.appfitness.objects.ButtonsNavigation
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
            ButtonsNavigation.nextAcitivity(this, Wiyg1Activity::class.java)
        }
    }
}