package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvTI = findViewById(R.id.cv_TI);
        CardView cvSI = findViewById(R.id.cv_SI);
        CardView cvMI = findViewById(R.id.cv_MI);
        Button btnTentang = findViewById(R.id.btn_tentang);
        Button btnKeluar = findViewById(R.id.btn_keluar);

        cvTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMainToTI = new Intent(MainActivity.this, TeknikInformatikaActivity.class);
                startActivity(iMainToTI);
            }
        });

        cvSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMainToSI = new Intent(MainActivity.this, SistemInformasiActivity.class);
                startActivity(iMainToSI);
            }
        });

        cvMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMainToMI = new Intent(MainActivity.this, ManajemenInformatikaActivity.class);
                startActivity(iMainToMI);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMainToAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(iMainToAbout);
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}