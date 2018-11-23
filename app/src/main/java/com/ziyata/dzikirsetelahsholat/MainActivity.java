package com.ziyata.dzikirsetelahsholat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnDzikir(View view) {
        Intent pindah = new Intent(this, RecycleDzikir.class);
        startActivity(pindah);
    }
}
