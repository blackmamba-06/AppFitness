package com.example.appfitness.signin_and_signup

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.R
import com.example.appfitness.databinding.ActivityWelcomeBinding
import com.example.appfitness.objects.ColorNotificationBarWhite

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ColorNotificationBarWhite.colorBarWhite(this)
        val name = intent.getStringExtra("NAME")
        if (name != null) {
            // Mostrar el mensaje de bienvenida con el nombre de la persona
            binding.tvWelcome.text = "Welcome, $name!"
        } else {
            // Si el nombre es null, muestra un mensaje de error
            binding.tvWelcome.text = "¡Error: Nombre no encontrado!"
        }

    }
}