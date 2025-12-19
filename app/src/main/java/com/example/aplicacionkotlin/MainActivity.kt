package com.example.aplicacionkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val usuarioText = findViewById<EditText>(R.id.usuarioText)
        val tituloText = findViewById<TextView>(R.id.tituloText)
        val campoText = findViewById<TextView>(R.id.campoText)
        val botonAceptar = findViewById<Button>(R.id.botonAceptar)
        val botonCancelar = findViewById<Button>(R.id.botonCancelar)

        botonAceptar.setOnClickListener {
            val nombre = usuarioText.text.toString()

            if(nombre.isNotEmpty()){
                campoText.text = "Bienvenido, $nombre"
            }

            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("NOMBRE_USUARIO", nombre)
            startActivity(intent)

        }

        botonCancelar.setOnClickListener {
            usuarioText.text.clear()
            campoText.text = ""
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}