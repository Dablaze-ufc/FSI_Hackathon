package com.phoenix.fsihackathon.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.phoenix.fsihackathon.MainActivity
import com.phoenix.fsihackathon.R

class SplashActivity : AppCompatActivity() {

    private val TIME_OUT = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },TIME_OUT.toLong())
    }
}
