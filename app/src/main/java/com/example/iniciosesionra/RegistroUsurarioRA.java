package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistroUsurarioRA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usurario_ra);

/*al confirmar la información ingresada en el registro volvera a la pantalla de iniciar sesión
Este boton debera regresar al mainActivity        */

        Button btn_Registrarse = findViewById(R.id.btn_Registrarse);
        btn_Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a la ventana de inicio  cuando se confirme la información
                Intent intent = new Intent(RegistroUsurarioRA.this, MainActivity.class);
                startActivity(intent);
            }
        });
/*  Este Texview tambien debera retornar al main Activity pero cuando no exista interes del usuario en guardar
la información  */

        TextView Link_VolverIni = findViewById(R.id.Link_VolverIni);
        Link_VolverIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a la v. inicio de sesión
                Intent intent = new Intent(RegistroUsurarioRA.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}