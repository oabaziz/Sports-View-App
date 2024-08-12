package com.example.sports_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.SportsViewHolder> {
    private ArrayList<Card> arrlst ;

    public MyAdapter(ArrayList<Card> arrlst) {
        this.arrlst = arrlst;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly =LayoutInflater.from(parent.getContext());
        View view =ly.inflate(R.layout.card_item ,null);
        return new SportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Card card = arrlst.get(position);
        holder.txt.setText(card.getText());
        holder.img.setImageResource(card.getImg());
    }

    @Override
    public int getItemCount() {
        return arrlst.size();
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;
        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
             img =(ImageView)itemView.findViewById(R.id.Card_imageView);
             txt =(TextView) itemView.findViewById(R.id.Card_textView);
        }
    }
}
