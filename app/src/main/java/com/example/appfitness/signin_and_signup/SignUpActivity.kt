package com.example.appfitness.signin_and_signup

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputType
import androidx.appcompat.app.AppCompatActivity
import com.example.appfitness.R
import com.example.appfitness.objects.ColorNotificationBarWhite
import com.example.appfitness.databinding.ActivitySignUpBinding
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan
import android.text.style.URLSpan
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.example.appfitness.objects.ButtonsNavigation


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private var passwordVisible = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        val fullText = resources.getString(R.string.termsAndCondicions)
        setContentView(view)

        binding.tvLogin.setOnClickListener {
            ButtonsNavigation.nextAcitivity(this, SignInActivity::class.java)
        }
        binding.btnRegister.setOnClickListener {
            ButtonsNavigation.nextAcitivity(this, SignUpNextActivity::class.java)
        }

        ColorNotificationBarWhite.colorBarWhite(this)
        showAndHidePassword()
        privacyAndCondicionsTextView(fullText)


    }


    private fun showAndHidePassword() {
        binding.ibPassword.setOnClickListener {
            passwordVisible = !passwordVisible
            if (passwordVisible) {
                binding.etPassword.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                binding.ibPassword.setImageResource(R.drawable.hide)

            } else {
                binding.etPassword.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                binding.ibPassword.setImageResource(R.drawable.show)
            }

            binding.etPassword.text?.let { it1 -> binding.etPassword.setSelection(it1.length) }
        }
    }

    private fun privacyAndCondicionsTextView(fullText: String) {

        val spannableString = SpannableString(fullText)

        val privacyPolicyStart = fullText.indexOf("Privacy Policy")
        val privacyPolicyEnd = privacyPolicyStart + "Privacy Policy".length
        val termOfUseStart = fullText.indexOf("Term of Use")
        val termOfUseEnd = termOfUseStart + "Term of Use".length

        val privacyPolicyClickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                openUrlInBrowser("https://developer.android.com/reference/android/text/InputType")
            }
        }
        spannableString.setSpan(
            privacyPolicyClickableSpan,
            privacyPolicyStart,
            privacyPolicyEnd,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            android.text.style.UnderlineSpan(),
            privacyPolicyStart,
            privacyPolicyEnd,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        val termOfUseSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                openUrlInBrowser("https://developer.android.com/reference/android/text/SpannableString")
            }
        }
        spannableString.setSpan(
            termOfUseSpan,
            termOfUseStart,
            termOfUseEnd,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            android.text.style.UnderlineSpan(),
            termOfUseStart,
            termOfUseEnd,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.tvCondicion.movementMethod = android.text.method.LinkMovementMethod.getInstance()
        binding.tvCondicion.text = spannableString

    }

    private fun openUrlInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}





