package com.example.climaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main2.*
import org.json.JSONException

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher);
        climafun()
    }
    private fun climafun() {

        var numero = intent.getStringExtra("ubicacion")
        var url = numero

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null, { response ->
            try {
                var main_object = response.getJSONObject("main")
                var array1 = response.getJSONArray("weather")
                var objeto = array1.getJSONObject(0)
                var temp = main_object.getDouble("temp")
                var descripcion = objeto.getString("description")
                var city = response.getString("name")
                var tempminima = main_object.getDouble("temp_min")
                var tempmaxima = main_object.getDouble("temp_max")
                var sensaciontm = main_object.getDouble("feels_like")

                tvcity.setText(city)
                tvdescripcion.setText(descripcion)
                tvtemp.text = temp.toString()
                tvmaxima.text = tempmaxima.toString()
                tvminima.text = tempminima.toString()
                tvfeel.text = sensaciontm.toString()

            } catch (e: JSONException) {
                e.printStackTrace()
            }
        },
            { error ->
                print("funciona")
            }
        )
        var vol: RequestQueue = Volley.newRequestQueue(this)
        vol.add(jsonObjectRequest)
    }
}