package com.example.android101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Sayfa3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa3)
        Toast.makeText(this,"İkinci Sayfa",Toast.LENGTH_LONG).show()
    }
    fun anasayfa(view: View){
        val don = Intent(applicationContext,MainActivity::class.java)
        startActivity(don)
        finish()
    }
}