package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class MapaDeforestacion extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_deforestacion);


        // img button para regresar a la principal
        ImageButton ib_salir =  findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para regresar a pagina principal
                Intent intent = new Intent(MapaDeforestacion.this, principalRA.class);
                startActivity(intent);
            }
        });

        //Web view para visualizar el mapa

        webView =  findViewById(R.id.VistaWEB);
        //habitación de js

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        //url & activarlo en el android manifiest
        String url= "https://storymaps.arcgis.com/stories/3aa66f71bbf246bfbbcda39091bf8292";
        webView.loadUrl(url);
    }

}