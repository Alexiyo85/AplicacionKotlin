package com.example.aplicacionkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button


class SegundaActivity : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)
        val textoBienvenida = findViewById<TextView>(R.id.textoBienvenida)
        val botonVolver = findViewById<Button>(R.id.botonVolver)

        val nombre = intent.getStringExtra("NOMBRE_USUARIO")
        textoBienvenida.text = "Bienvenido, $nombre"

        botonVolver.setOnClickListener {
            finish()
        }
    }
}