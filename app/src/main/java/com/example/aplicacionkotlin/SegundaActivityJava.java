package com.example.aplicacionkotlin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivityJava extends AppCompatActivity {

    TextView textoBienvenida;
    Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textoBienvenida = findViewById(R.id.textoBienvenida);
        botonVolver = findViewById(R.id.botonVolver);

        String nombre = getIntent().getStringExtra("NOMBRE_USUARIO");
        textoBienvenida.setText("Bienvenido, " + nombre);

        botonVolver.setOnClickListener(v -> finish());
    }
}
