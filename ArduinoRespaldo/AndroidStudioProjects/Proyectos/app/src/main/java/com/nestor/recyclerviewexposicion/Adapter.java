package com.nestor.recyclerviewexposicion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class Adapter extends RecyclerView.Adapter <Adapter.Viewholder> implements View.OnClickListener {

    private List<ModelClaas> modelClaasList;
    private View.OnClickListener listener;

    public Adapter(List<ModelClaas> modelClaasList) {
        this.modelClaasList = modelClaasList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);

        view.setOnClickListener(this);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {

//        int resource = modelClaasList.get(position).getImageIcon();
//        String title = modelClaasList.get(position).getTitle();
//        String body = modelClaasList.get(position).getBody();
        ModelClaas modelo = modelClaasList.get(position);
        viewholder.setData(modelo);
    }

    @Override
    public int getItemCount() {
        return modelClaasList.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener != null)
            listener.onClick(v);
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;
        private TextView body;
        private Button btn;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textTitle);
            body = itemView.findViewById(R.id.textBody);
            //btn = itemView.findViewById(R.id.btnAccion);
        }

        private void setData(int imageResource, String titleText, String bodyText){

            imageView.setImageResource(imageResource);
            title.setText(titleText);
            body.setText(bodyText);
        }

        public void setData(final ModelClaas modelo) {
            imageView.setImageResource((modelo.getImageIcon()));
            title.setText(modelo.getTitle());
//            body.setText(modelo.getBody());
            body.setText(modelo.getTitleBody());

        }
    }
}