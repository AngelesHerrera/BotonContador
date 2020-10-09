package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contador:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind
        val nameTxt = findViewById<TextView>(R.id.txtname)
        val nameBtn= findViewById<Button>(R.id.btnname)
        val countTxt= findViewById<TextView>(R.id.txtcount)
        val restBtn= findViewById<Button>(R.id.buttonRestar)
        val resetBtn= findViewById<Button>(R.id.buttonReset)
        nameTxt.setText("Angeles Herrera")
        nameBtn.setOnClickListener {
            contador = contador.inc()
            countTxt.setText("$contador")
        }
        restBtn.setOnClickListener {
            contador=contador.dec()
            countTxt.setText("$contador")
        }
        resetBtn.setOnClickListener {
            contador=0
            countTxt.setText("$contador")
        }
    }
}