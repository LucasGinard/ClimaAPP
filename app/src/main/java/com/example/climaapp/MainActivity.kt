package com.example.climaapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var medidatemp = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_launcher)


        var apikey = "su KEY VA AQUI"

        pasar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=asuncion&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
        pasar2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Ciudad%20del%20Este,%20PY&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
        pasar3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=encarnacion&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
        pasar4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Loma%20Plata,%20PY&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
        pasar5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Villarrica&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }

        pasar6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Fernando%20de%20la%20Mora,%20PY&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
        pasar7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("ubicacion","https://api.openweathermap.org/data/2.5/weather?q=Caacupé,%20PY&lang=sp&appid=${apikey}&units=${medidatemp}")
            }
            startActivity(intent)
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButton ->
                    if (checked) {
                        this.medidatemp = "imperial"
                    }
                R.id.radioButton2 ->
                    if (checked) {
                        this.medidatemp = "metric"
                    }
                R.id.radioButton3 ->
                    if (checked) {
                        this.medidatemp = ""
                        }
                    }
            }
        }
    }
