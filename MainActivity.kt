package com.example.android101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Uygulamaya Hoşgeldin",Toast.LENGTH_LONG).show()
    }
    fun sayfa1(view: View){
        val intent1 = Intent(applicationContext,Sayfa2::class.java)
        startActivity(intent1)
        finish()
    }
    fun sayfa2(view: View){
        val intent2 = Intent(applicationContext,Sayfa3::class.java)
        startActivity(intent2)
        finish()
    }
    fun sayfa3(view: View){
        val intent3 = Intent(applicationContext,Sayfa4::class.java)
        startActivity(intent3)
        finish()
    }
    fun sayfa4(view: View){
        val intent4 = Intent(applicationContext,Sayfa5::class.java)
        startActivity(intent4)
        finish()
    }
    fun sayfa5(view: View){
        val intent5 = Intent(applicationContext,Sayfa6::class.java)
        startActivity(intent5)
        finish()
    }
    fun sayfa6(view: View){
        val intent6 = Intent(applicationContext,Sayfa7::class.java)
        startActivity(intent6)
        finish()
    }
}