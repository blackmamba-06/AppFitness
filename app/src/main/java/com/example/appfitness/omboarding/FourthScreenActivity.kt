package com.example.appfitness.omboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.appfitness.R
import com.example.appfitness.objects.ButtonsNavigation
import com.example.appfitness.objects.ColorNotificationBarBlue
import com.example.appfitness.signin_and_signup.SignUpActivity

class FourthScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_screen)
        ColorNotificationBarBlue.colorBarBlue(this)

        findViewById<AppCompatButton>(R.id.btnFourth).setOnClickListener {
            ButtonsNavigation.nextAcitivity(this, SignUpActivity::class.java)
        }

    }
}