package com.nestor.apoyocartas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorCarta extends RecyclerView.Adapter<AdaptadorCarta.MiHolder> {
    private List<Carta> ListaCarta;

    public AdaptadorCarta(List<Carta> listaCarta){
        this.ListaCarta = listaCarta;
    }

    @NonNull
    @Override
    public AdaptadorCarta.MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaCarta = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carta,parent,false);
        return new MiHolder(vistaCarta);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCarta.MiHolder holder, int position) {
        Carta modelo = ListaCarta.get(position);
        holder.setData(modelo);
    }

    @Override
    public int getItemCount() {
        return ListaCarta.size();
    }

    public class MiHolder extends RecyclerView.ViewHolder {
        private ImageView carta;
        private TextView numero;

        public MiHolder(@NonNull View itemView) {
            super(itemView);

            carta = itemView.findViewById(R.id.fotoCarta);
            numero = itemView.findViewById(R.id.numero);
        }

        public void setData(final Carta modelo) {
            numero.setText(String.valueOf(modelo.getNumero()));

            switch (modelo.getNumero()) {
                case 1:
                    carta.setImageResource(R.drawable.espada1);
                    break;
                case 2:
                    carta.setImageResource(R.drawable.espada2);
                    break;
                case 3:
                    carta.setImageResource(R.drawable.espada3);
                    break;
                case 4:
                    carta.setImageResource(R.drawable.espada4);
                    break;
                case 5:
                    carta.setImageResource(R.drawable.espada5);
                    break;
                case 6:
                    carta.setImageResource(R.drawable.espada6);
                    break;
                case 7:
                    carta.setImageResource(R.drawable.espada7);
                    break;
                case 8:
                    carta.setImageResource(R.drawable.espada8);
                    break;
                case 9:
                    carta.setImageResource(R.drawable.espada9);
                    break;
                case 10:
                    carta.setImageResource(R.drawable.espada10);
                    break;
                case 11:
                    carta.setImageResource(R.drawable.espada11);
                    break;
            }
        }
    }
}
