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

public class RegistroPlantas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_plantas);

// img butoon para regresar a la principal
        ImageButton ib_salir =  findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a pagina principal
                Intent intent = new Intent(RegistroPlantas.this, principalRA.class);
                startActivity(intent);
            }
        });
        // button Estadistica
        Button btnEstadistica = findViewById(R.id.btnEstadistica);
        btnEstadistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ingresar a v.Estadistica
                Intent intent =  new Intent(RegistroPlantas.this, Estadisticas.class);
                startActivity(intent);
            }
        });
        // button  Consejos

        Button btnConsejos =  findViewById(R.id.btnConsejos);
        btnConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a v.Consejos
                Intent intent = new Intent(RegistroPlantas.this, Consejos.class);
                startActivity(intent);
            }
        });

        // button Recursos
        Button btnRecursos =  findViewById(R.id.btnRecursos);
        btnRecursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent para ir a v.Recursos
                Intent intent =  new Intent (RegistroPlantas.this, Recursos.class);
                startActivity(intent);
            }
        });

        //Spinner para mostrar lista desplegable de departamento

        Spinner spinner = findViewById(R.id.Spin_Departamento);

        //Arreglo de strings desde strings.xml
        String[] opcionesDepartamento =  getResources().getStringArray(R.array.DepartamentoOpciones);

        //Adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opcionesDepartamento);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Configuración del selectlistener para manejar los eventos de selección

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String seleccion = opcionesDepartamento[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Spinner para mostrar lista desplegable del mes

        Spinner spinner2 = findViewById(R.id.Spin_Meses);

        //arreglo desde el strings.xml
        String[] opcionesMeses = getResources().getStringArray(R.array.MesOpciones);

        //Adaotador para el spinner
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opcionesMeses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        //Configuración del SetOnItemSelectedListener

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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



