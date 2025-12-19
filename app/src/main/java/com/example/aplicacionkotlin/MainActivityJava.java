package com.example.aplicacionkotlin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityJava extends AppCompatActivity {
    EditText usuarioText;
    TextView tituloText;
    TextView campoText;
    Button botonAceptar;
    Button botonCanlelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioText = findViewById(R.id.usuarioText);
        tituloText = findViewById(R.id.tituloText);
        campoText = findViewById(R.id.campoText);
        botonAceptar = findViewById(R.id.botonAceptar);
        botonCanlelar = findViewById(R.id.botonCancelar);

        botonAceptar.setOnClickListener(v -> {
            String nombre = usuarioText.getText().toString();
            Intent intent = new Intent(MainActivityJava.this, SegundaActivityJava.class);
            intent.putExtra("NOMBRE_USUARIO", nombre);
            startActivity(intent);
        });

        botonCanlelar.setOnClickListener(v -> {
            usuarioText.setText("");
            campoText.setText("");
        });

    }

}
