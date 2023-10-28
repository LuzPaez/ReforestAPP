package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecuperarContrasena3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena3);
/*El ultimo boton de recuperar contraseña debera mostrar un mensaje de que se ha cambiado la contraseña
Sin embargo el boton confirmar redirigira por ahora a la ventana de inicio */

        Button btn_Confirmar =  findViewById(R.id.btn_Confirmar);
        btn_Confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //crear el intent para regresar al inicio de sesión
                Intent intent = new Intent(RecuperarContrasena3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}