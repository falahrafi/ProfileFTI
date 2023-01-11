package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SistemInformasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_informasi);

        CardView btnVisiMisi = findViewById(R.id.cv_SI_visi_misi);
        CardView cvKompetensi = findViewById(R.id.cv_SI_kompetensi);
        CardView cvDaftarDosen = findViewById(R.id.cv_SI_daftar_dosen);
        Button btnKembali = findViewById(R.id.btn_kembali);

        btnVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSItoVisi = new Intent(SistemInformasiActivity.this, SiVisiMisiActivity.class);
                startActivity(iSItoVisi);
            }
        });

        cvKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSItoKompetensi = new Intent(SistemInformasiActivity.this, SiKompetensiActivity.class);
                startActivity(iSItoKompetensi);
            }
        });

        cvDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSItoDosen = new Intent(SistemInformasiActivity.this, SiDaftarDosenActivity.class);
                startActivity(iSItoDosen);
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