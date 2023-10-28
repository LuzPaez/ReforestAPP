package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OlvidoContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvido_contrasena);

//El boton redirigira a la siguiente vista: RecuperarContrasena2

        Button btn_EnviarCodigo = findViewById(R.id.btn_EnviarCodigo);
        btn_EnviarCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a la segunda pantalla de recuperación
                Intent intent = new Intent(OlvidoContrasena.this,RecuperarContrasena2.class);
                startActivity(intent);
            }
        });
//Enlace que redirigirá a la vista: inicio de sesión

        TextView Link_VolverIni = findViewById(R.id.Link_VolverIni);
        Link_VolverIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a la pantalla inicio sesión
                Intent intent = new Intent( OlvidoContrasena.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}