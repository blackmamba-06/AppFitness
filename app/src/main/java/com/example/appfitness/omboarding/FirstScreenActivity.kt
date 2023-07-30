package com.example.appfitness.omboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appfitness.objects.ColorNotificationBarBlue
import com.example.appfitness.R
import com.example.appfitness.objects.ButtonsNavigation

class FirstScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        ColorNotificationBarBlue.colorBarBlue(this)

        findViewById<Button>(R.id.firstBtn).setOnClickListener{
            ButtonsNavigation.nextAcitivity(this, SecondScreenActivity::class.java)
        }
    }
}