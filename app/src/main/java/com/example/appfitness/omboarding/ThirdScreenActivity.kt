package com.example.appfitness.omboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appfitness.R
import com.example.appfitness.objects.ButtonsNavigation
import com.example.appfitness.objects.ColorNotificationBarBlue

class ThirdScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_screen)
        ColorNotificationBarBlue.colorBarBlue(this)
        findViewById<AppCompatButton>(R.id.btnThird).setOnClickListener{
            ButtonsNavigation.nextAcitivity(this, FourthScreenActivity::class.java)
        }


    }
}