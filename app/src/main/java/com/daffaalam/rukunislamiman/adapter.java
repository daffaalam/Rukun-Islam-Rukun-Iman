package com.daffaalam.rukunislamiman;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.CustomViewHolder> {
    private ArrayList<data> dataArrayList;

    public adapter(home home, ArrayList<data> arrayList) {
        this.dataArrayList = arrayList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams layoutParams;
        layoutParams = new RecyclerView.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, null);
        view.setLayoutParams(layoutParams);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {

        holder.judul.setText(dataArrayList.get(position).getJudul());
        holder.gambar.setImageResource(dataArrayList.get(position).getGambar());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v
                        .getContext()
                        .startActivity(new Intent(v.getContext(), detail.class)
                        .putExtra("JUDUL", dataArrayList.get(position).getJudul()));

            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != dataArrayList ? dataArrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public TextView judul;
        public ImageView gambar;
        public CardView cardView;

        public CustomViewHolder(final View view) {
            super(view);
            judul = (TextView) view.findViewById(R.id.judul_cv);
            gambar = (ImageView) view.findViewById(R.id.gambar);
            cardView = (CardView) view.findViewById(R.id.card_view);

        }
    }
}
