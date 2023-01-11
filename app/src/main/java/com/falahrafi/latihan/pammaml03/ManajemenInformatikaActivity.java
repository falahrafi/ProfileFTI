package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManajemenInformatikaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manajemen_informatika);

        CardView cvVisiMisi = findViewById(R.id.cv_MI_visi_misi);
        CardView cvKompetensi = findViewById(R.id.cv_MI_kompetensi);
        CardView cvDaftarDosen = findViewById(R.id.cv_MI_daftar_dosen);
        Button btnKembali = findViewById(R.id.btn_kembali);

        cvVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMItoVisi = new Intent(ManajemenInformatikaActivity.this, MiVisiMisiActivity.class);
                startActivity(iMItoVisi);
            }
        });

        cvKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMItoKompetensi = new Intent(ManajemenInformatikaActivity.this, MiKompetensiActivity.class);
                startActivity(iMItoKompetensi);
            }
        });

        cvDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMItoDosen = new Intent(ManajemenInformatikaActivity.this, MiDaftarDosenActivity.class);
                startActivity(iMItoDosen);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}