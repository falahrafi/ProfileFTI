package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MiDaftarDosenActivity extends AppCompatActivity {
    private RecyclerView rvDosens;
    private ArrayList<Dosen> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_daftar_dosen);

        Button btnKembali = findViewById(R.id.btn_kembali);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        rvDosens = findViewById(R.id.rv_dosens);
        rvDosens.setHasFixedSize(true);

        list.addAll(DosensData.getListData("Manajemen Informatika"));
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvDosens.setLayoutManager(new LinearLayoutManager(this));
        ListDosenAdapter listDosenAdapter = new ListDosenAdapter(list);
        rvDosens.setAdapter(listDosenAdapter);
    }
}