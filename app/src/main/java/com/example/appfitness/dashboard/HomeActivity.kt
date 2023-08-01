package com.example.appfitness.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfitness.R
import com.example.appfitness.databinding.ActivityHomeBinding
import com.example.appfitness.objects.ColorNotificationBarWhite

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ColorNotificationBarWhite.colorBarWhite(this)
        val name = intent.getStringExtra("NAME")
        val lastName = intent.getStringExtra("LAST_NAME")
        if (name != null) {
            // Mostrar el mensaje de bienvenida con el nombre de la persona
            binding.tvName.text = "$name $lastName"
        } else {
            // Si el nombre es null, muestra un mensaje de error
            binding.tvName.text = "¡Error: Nombre no encontrado!"
        }

    }
}