package com.example.appfitness.signin_and_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.R
import com.example.appfitness.databinding.ActivityWiyg1Binding
import com.example.appfitness.objects.ColorNotificationBarWhite

class Wiyg1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityWiyg1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWiyg1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ColorNotificationBarWhite.colorBarWhite(this)
    }
}