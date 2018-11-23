package com.ziyata.dzikirsetelahsholat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String[] dzikirSetelahSholat, dzikir;

    public Adapter(Context context, String[] dzikirSetelahSholat, String[] dzikir) {
        this.context = context;
        this.dzikirSetelahSholat = dzikirSetelahSholat;
        this.dzikir = dzikir;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_dzikir,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        viewHolder.txtIsiDzikir.setText(dzikirSetelahSholat[i]);
        viewHolder.txtNamaDzikir.setText(dzikir[i]);

    }

    @Override
    public int getItemCount() {
        return dzikirSetelahSholat.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaDzikir, txtIsiDzikir;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNamaDzikir = itemView.findViewById(R.id.txtNamaDzikir);
            txtIsiDzikir = itemView.findViewById(R.id.txtIsiDzikir);
        }
    }
}
