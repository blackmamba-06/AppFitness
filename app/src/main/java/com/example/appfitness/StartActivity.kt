package com.example.appfitness

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.appfitness.omboarding.FirstScreenActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        barNotificacion()
        nextActivity()
    }
    fun barNotificacion(){

        val drawableNotification: Drawable? = ContextCompat.getDrawable(this,
            R.drawable.background_start
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
            window.addFlags(android.view.WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.setBackgroundDrawable(drawableNotification)
        }
    }
     private fun nextActivity(){
        val btnGetStart = findViewById<Button>(R.id.getStarted)
        btnGetStart.setOnClickListener {
            val intent = Intent(this, FirstScreenActivity::class.java)
            startActivity(intent)
        }
    }
}