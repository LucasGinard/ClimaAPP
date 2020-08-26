package com.example.climaapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher);

        pasar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=asuncion&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp")
            }
            startActivity(intent)
        }
        pasar2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Ciudad%20del%20Este,%20PY&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp")
            }
            startActivity(intent)
        }
        pasar3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=encarnacion&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp")
            }
            startActivity(intent)
        }
        pasar4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Loma%20Plata,%20PY&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp")
            }
            startActivity(intent)
        }
        pasar5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Villarrica&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp")
            }
            startActivity(intent)
        }
    }
}