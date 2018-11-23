package com.ziyata.dzikirsetelahsholat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleDzikir extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String [] dzikirSetelahSolat, dzikir;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_dzikir);
        ButterKnife.bind(this);

        dzikirSetelahSolat = getResources().getStringArray(R.array.Dzikir_Setelah_Sholat);
        dzikir = getResources().getStringArray(R.array.Dzikir);


        adapter = new Adapter(RecycleDzikir.this, dzikirSetelahSolat,dzikir);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleDzikir.this));
        myRecycleView.setAdapter(adapter);
    }
}
