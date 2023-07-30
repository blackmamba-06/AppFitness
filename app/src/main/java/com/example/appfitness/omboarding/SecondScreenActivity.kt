package com.example.appfitness.omboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appfitness.R
import com.example.appfitness.objects.ButtonsNavigation
import com.example.appfitness.objects.ColorNotificationBarBlue

class SecondScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        ColorNotificationBarBlue.colorBarBlue(this)

        findViewById<AppCompatButton>(R.id.secondtBtn).setOnClickListener {
            ButtonsNavigation.nextAcitivity(this, ThirdScreenActivity::class.java)
        }
    }
}