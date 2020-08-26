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

        var apikey = "su KEY VA AQUI"

        pasar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=asuncion&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
        pasar2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Ciudad%20del%20Este,%20PY&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
        pasar3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=encarnacion&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
        pasar4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Loma%20Plata,%20PY&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
        pasar5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Villarrica&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }

        pasar6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Fernando%20de%20la%20Mora,%20PY&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
        pasar7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Caacupé,%20PY&units=metric&lang=sp&appid=${apikey}")
            }
            startActivity(intent)
        }
    }
}