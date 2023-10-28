package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Estadisticas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

// img button para regresar a la principal
        ImageButton ib_salir =  findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a pagina principal
                Intent intent = new Intent(Estadisticas.this, principalRA.class);
                startActivity(intent);
            }
        });

        //BOTONES Registro plantas, consejos y recursos
        // button Registro
        Button btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ingresar a v.Registro plantas
                Intent intent =  new Intent(Estadisticas.this, RegistroPlantas.class);
                startActivity(intent);
            }
        });

        // button Consejos
        Button btnConsejos = findViewById(R.id.btnConsejos);
        btnConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ingresar a v.Consejos
                Intent intent =  new Intent(Estadisticas.this, Consejos.class);
                startActivity(intent);
            }
        });


        // button Recursos
        Button btnRecursos = findViewById(R.id.btnRecursos);
        btnRecursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ingresar a v.Recursos
                Intent intent =  new Intent(Estadisticas.this, Recursos.class);
                startActivity(intent);
            }
        });

        //Spinner para mostrar lista desplegable del mes

        Spinner spinner = findViewById(R.id.Spin_Meses);

        //arreglo desde el strings.xml
        String[] opcionesMeses = getResources().getStringArray(R.array.MesOpciones);

        //Adaptador para el spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opcionesMeses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Configuración del SetOnItemSelectedListener

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String seleccion = opcionesMeses[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}

