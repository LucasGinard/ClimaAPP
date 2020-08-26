package com.example.climaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main2.*
import org.json.JSONException
import javax.xml.parsers.ParserConfigurationException
import kotlin.math.absoluteValue

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
        getSupportActionBar()?.setIcon(R.mipmap.ic_launcher);
        climafun()

    }
    private fun climafun() {
        var url = "https://api.openweathermap.org/data/2.5/weather?q=asuncion&appid=95d164075f415ce1eff1ab7453be71bd&units=metric&lang=sp"
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null, { response ->
            try {
                var main_object = response.getJSONObject("main")
                var array1 = response.getJSONArray("weather")
                var objeto = array1.getJSONObject(0)
                var temp = main_object.getDouble("temp")
                var descripcion = objeto.getString("description")
                var city = response.getString("name")
                var tempminima = main_object.getDouble("temp_min")
                var tempmaxima = main_object.getDouble("temp_max")
                var sensaciontm = main_object.getDouble("main.feels_like")

                tvcity.setText(city)
                tvdescripcion.setText(descripcion)



                var temp_int:Double = temp
                var centi:Double = (temp_int -32)/1.8000
                var i:Int = centi.toInt()
                tvtemp.setText(i)


               // tvminima.setText(tempminima.toString())
                //tvmaxima.setText(tempmaxima.toInt())


            }catch (e: JSONException){
                e.printStackTrace()
            }
        },
            { error ->
                // TODO: Handle error
            }
        )
        var vol: RequestQueue = Volley.newRequestQueue(this)
        vol.add(jsonObjectRequest)
    }
}