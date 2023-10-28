package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecuperarContrasena2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena2);

// button para ir a la vista de recuperar contraseña 3
        Button btn_Confirmar = findViewById(R.id.btn_Confirmar);
        btn_Confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para continuar al recuperar contraseña 3
                Intent intent = new Intent( RecuperarContrasena2.this ,RecuperarContrasena3.class);
                startActivity(intent);
            }
        });

// Texview redireccionamiento para volver al inicio de sesión

        TextView Link_VolverIni =  findViewById(R.id.Link_VolverIni);
        Link_VolverIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para volver al inicio de sesión
                Intent intent = new Intent( RecuperarContrasena2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}