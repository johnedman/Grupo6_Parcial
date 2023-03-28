package com.example.grupo6_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.grupo6_parcial.Partidos;
import com.squareup.picasso.Picasso;

public class Detalle extends AppCompatActivity {

    private TextView nombre_rival, titular, goles, goles_rival;
    private ImageView url_escudo_rival;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        setTitle ("ListaPartidos");

        nombre_rival = findViewById(R.id.tv_nombre_rival);
        titular = findViewById(R.id.tv_titular);
        goles = findViewById(R.id.tv_goles);
        goles_rival = findViewById(R.id.tv_goles_rival);
        url_escudo_rival =findViewById(R.id.iv_escudo);

        Partidos miPartidoAtrapado = (Partidos) getIntent().getSerializableExtra("Partido");

        nombre_rival.setText(miPartidoAtrapado.getNombre_Rival());
        titular.setText(miPartidoAtrapado.getTitular());
        goles.setText(miPartidoAtrapado.getGoles().toString());
        goles_rival.setText(miPartidoAtrapado.getGoles_Rival().toString());
        Picasso.get()
                .load(miPartidoAtrapado.getUrl_Escudo())
                .error(R.drawable.ic_launcher_background)
                .into(url_escudo_rival);
    }
}