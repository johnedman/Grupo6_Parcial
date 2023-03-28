package com.example.grupo6_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Partidos> ListaPartidos;
    private RecyclerView rvListaPartidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Partidos");
        cargarDatos();

        rvListaPartidos = findViewById(R.id.rv_lista_partidos);

        Adaptador miAdaptador = new Adaptador(ListaPartidos);

        miAdaptador.setOnItemClickListener(new Adaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Partidos miPartido, int posicion) {

                Intent intent = new Intent(MainActivity.this, Detalle.class);
                intent.putExtra("producto", miPartido);
                startActivity(intent);

            }
        });


        rvListaPartidos.setAdapter(miAdaptador);
        rvListaPartidos.setLayoutManager(new LinearLayoutManager(this));
    }

    public void cargarDatos(){
        Partidos partido1 = new Partidos();
        partido1.setNombre("Uruguay");
        partido1.setTitular("Paolo Montero, Álvaro Recoba, Pablo Bengoechea, Roque Maspoli, Obdulio Varela");
        partido1.setGoles(0.00);
        partido1.setGoles_Rival(0.00);
        partido1.setUrl_Escudo("https://www.nicepng.com/png/detail/851-8511919_escudo-asociacin-uruguaya-de-ftbol-v1-uruguay-national.png");


        Partidos partido2 = new Partidos();
        partido2.setNombre("Argentina");
        partido2.setTitular("Emiliano Martínez,Gerónimo Rulli, Franco Armani, Cristian Romero,Lisandro Martínez");
        partido2.setGoles(1.00);
        partido2.setGoles_Rival(1.00);
        partido2.setUrl_Escudo("http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/1879.png");

        Partidos partido3 = new Partidos();
        partido3.setNombre("Peru");
        partido3.setTitular("Pedro Gallese,Carlos Cáceda,José Carvallo, Luis Abram,Anderson Santamaría");
        partido3.setGoles(3.00);
        partido3.setGoles_Rival(2.00);
        partido3.setUrl_Escudo("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Logotipo_de_la_Federaci%C3%B3n_Peruana_de_F%C3%BAtbol.svg/1200px-Logotipo_de_la_Federaci%C3%B3n_Peruana_de_F%C3%BAtbol.svg.png");

        Partidos partido4 = new Partidos();
        partido4.setNombre("Brasil");
        partido4.setTitular("Ederson,Weverton,Mycael,Éder Militão,Bremer");
        partido4.setGoles(1.00);
        partido4.setGoles_Rival(2.00);
        partido4.setUrl_Escudo("http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/1881.png");

        Partidos partido5 = new Partidos();
        partido5.setNombre("Venezuela");
        partido5.setTitular("Joel Graterol,Alain Baroja,Cristopher Varela,Yordan Osorio,Christian Makoun");
        partido5.setGoles(0.00);
        partido5.setGoles_Rival(0.00);
        partido5.setUrl_Escudo("http://as00.epimg.net/img/comunes/fotos/fichas/equipos/large/2930.png");

        ListaPartidos = new ArrayList<>();
        ListaPartidos.add(partido1);
        ListaPartidos.add(partido2);
        ListaPartidos.add(partido3);
        ListaPartidos.add(partido4);
        ListaPartidos.add(partido5);

    }

}

