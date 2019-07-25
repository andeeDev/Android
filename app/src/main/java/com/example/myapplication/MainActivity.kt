package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*button.setOnClickListener{
            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }*/
        button.setOnClickListener {

            val queue = Volley.newRequestQueue(this)
            val url = "http://10.0.2.2:8000"
            val stringRequest = StringRequest(
                Request.Method.GET, url, Response.Listener<String> {
                        response ->  textView.text = "Response is ${response.substring(0, 500)}"
                },
                Response.ErrorListener { textView.text = "That didn't work }" })

            queue.add(stringRequest)


        }
    }


}
