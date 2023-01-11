package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeknikInformatikaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknik_informatika);

        CardView cvVisiMisi = findViewById(R.id.cv_TI_visi_misi);
        CardView cvKompetensi = findViewById(R.id.cv_TI_kompetensi);
        CardView cvDaftarDosen = findViewById(R.id.cv_TI_daftar_dosen);
        Button btnKembali = findViewById(R.id.btn_kembali);

        cvVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTItoVisi = new Intent(TeknikInformatikaActivity.this, TiVisiMisiActivity.class);
                startActivity(iTItoVisi);
            }
        });

        cvKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTItoKompetensi = new Intent(TeknikInformatikaActivity.this, TiKompetensiActivity.class);
                startActivity(iTItoKompetensi);
            }
        });

        cvDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTItoDosen = new Intent(TeknikInformatikaActivity.this, TiDaftarDosenActivity.class);
                startActivity(iTItoDosen);
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