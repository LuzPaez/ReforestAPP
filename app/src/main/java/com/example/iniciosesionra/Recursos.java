package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Recursos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos);

        // img button para regresar a la principal
        ImageButton ib_salir =  findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a pagina principal
                Intent intent = new Intent(Recursos.this, principalRA.class);
                startActivity(intent);
            }
        });
        //botones :  Registro, Estadisticas, Consejos

        // button Registro
        Button btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(view -> {
            //intent para ingresar a v.Registro
            Intent intent =  new Intent(Recursos.this, RegistroPlantas.class);
            startActivity(intent);
        });

        // button Estadistica
        Button btnEstadistica = findViewById(R.id.btnEstadistica);
        btnEstadistica.setOnClickListener(view -> {
            //intent para ingresar a v.Estadistica
            Intent intent =  new Intent(Recursos.this, Estadisticas.class);
            startActivity(intent);
        });

        // button Consejos
        Button btnConsejos = findViewById(R.id.btnConsejos);
        btnConsejos.setOnClickListener(view -> {
            //intent para ingresar a v.Consejos
            Intent intent =  new Intent(Recursos.this, Consejos.class);
            startActivity(intent);
        });

        //button para ir a Mapa de desforestación
        Button btnIrAMapa = findViewById(R.id.btnIrAMapa);
        btnIrAMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a v.Mapa deforestación
                Intent intent = new Intent(Recursos.this, MapaDeforestacion.class);
                startActivity(intent);
            }
        });


        // IMAGEN BUTTON PARA IR A PAGINAS INTERESANTES

        ImageButton ib_pag1 = findViewById(R.id.ib_pag1);
        ib_pag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //definición del enlace a abrir
                String url= "https://es.educaplay.com/recursos-educativos/7199844-la_deforestacion.html";
                //Intent para abrir la pagina web

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        ImageButton ib_pag2 = findViewById(R.id.ib_pag2);
        ib_pag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://ecocosas.com/cambio-climatico/reforestacion/";
                //intent para abrir la pagina
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        ImageButton ib_pag3 = findViewById(R.id.ib_pag3);
        ib_pag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.contextoganadero.com/politica/colombia-el-camino-la-reforestacion-de-los-180-millones-de-arboles-antes-de-2022";
                //intent para abrir la pagina
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        ImageButton ib_pag4 = findViewById(R.id.ib_pag4);
        ib_pag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.minambiente.gov.co/direccion-de-bosques-biodiversidad-y-servicios-ecosistemicos/control-a-la-deforestacion-2/";
                //intent para abrir la pagina
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        ImageButton ib_pag5 = findViewById(R.id.ib_pag5);
        ib_pag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.minambiente.gov.co/se-reduce-y-se-contiene-la-deforestacion-en-colombia-durante-los-ultimos-cuatro-anos/";
                //intent para abrir la pagina
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        ImageButton ib_pag6 = findViewById(R.id.ib_pag6);
        ib_pag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.un.org/es/desa/reforestation-the-easiest";
                //intent para abrir la pagina
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}