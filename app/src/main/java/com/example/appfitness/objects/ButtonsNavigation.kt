package com.example.appfitness.objects

import android.content.Context
import android.content.Intent

object ButtonsNavigation {
    fun nextAcitivity(context: Context, destinationActivity: Class<*>) {
        val intent = Intent(context, destinationActivity)
        context.startActivity(intent)
    }


}