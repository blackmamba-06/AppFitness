package com.example.appfitness.objects

import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.appfitness.R

object ColorNotificationBarBlue {
     fun colorBarBlue(context: Context) {
        val drawableNotification: Drawable? = ContextCompat.getDrawable(context,
            R.drawable.background_start
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            (context as? Activity)?.window?.apply {
                statusBarColor = ContextCompat.getColor(context, android.R.color.transparent)
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                setBackgroundDrawable(drawableNotification)
            }
        }
    }
}
