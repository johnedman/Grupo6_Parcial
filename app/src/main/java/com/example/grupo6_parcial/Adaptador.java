package com.example.grupo6_parcial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

//JOHN MANTILLA, MARIO MESA, JHAN lEON

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private ArrayList<Partidos> listadoInformacion;

    private OnItemClickListener onItemClickListener;

    public void setListadoInformacion(ArrayList<Partidos> listadoInformacion) {
        this.listadoInformacion = listadoInformacion;
        notifyDataSetChanged();
    }

    public Adaptador(ArrayList<Partidos> listadoInformacion) {
        this.listadoInformacion = listadoInformacion;
        this.onItemClickListener = null;
    }


    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View miView = LayoutInflater.from(parent.getContext()).inflate(R.layout.Partidos_Lista,parent,false);
        return new ViewHolder(miView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        Partidos miPartido = listadoInformacion.get(position);
        holder.enlazar(miPartido);

    }

    @Override
    public int getItemCount() {
        return listadoInformacion.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNombre_Rival, tvTitular, tvGoles, tvGoles_Rival;
        private ImageView ivEscudo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre_Rival = itemView.findViewById(R.id.tv_nombre_rival);
            tvTitular = itemView.findViewById(R.id.tv_titular);
            tvGoles = itemView.findViewById(R.id.tv_goles);
            tvGoles_Rival= itemView.findViewById(R.id.tv_goles_rival);
            ivEscudo = itemView.findViewById(R.id.iv_escudo);
        }

        public void enlazar(Partidos miPartido){
            tvNombre_Rival.setText(miPartido.getNombre_Rival());
            tvTitular.setText(miPartido.getTitular());
            tvGoles.setText(miPartido.getGoles().toString());
            tvGoles_Rival.setText(miPartido.getGoles_Rival().toString());
            Picasso.get().load(miProducto.getUrlImagen()).error(R.drawable.ic_launcher_background).into(ivProducto);







        }

    }

}
