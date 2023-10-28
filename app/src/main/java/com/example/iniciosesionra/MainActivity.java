package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Boton que ingresa a la aplicación - pantalla principal
        Button btnIngresar  = findViewById(R.id.btn_Ingresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent para iniciar la actividad de ingreso
                Intent intent = new Intent(MainActivity.this, principalRA.class);
                startActivity(intent);
            }
        });

// referencia al textview que ingresa a: recuperar contraseña
        TextView Link_OlvidoContrasena = findViewById(R.id.Link_OlvidoContrasena);
        Link_OlvidoContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para iniciar la actividad de ir a recuperar contraseña
                Intent intent = new Intent(MainActivity.this , OlvidoContrasena.class);
                startActivity(intent);
            }
        });
//Referencia al textview que ingresa a: Registro de usuario
        TextView Link_Crear_Cuenta = findViewById(R.id.Link_Crear_Cuenta);
        Link_Crear_Cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para inicia a la actividad de ir al registro de usuario
                Intent intent = new Intent(MainActivity.this, RegistroUsurarioRA.class);
                startActivity(intent);

            }
        });

    }
}