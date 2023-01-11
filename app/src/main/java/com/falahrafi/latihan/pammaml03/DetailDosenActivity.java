package com.falahrafi.latihan.pammaml03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailDosenActivity extends AppCompatActivity {

    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_JENIS_KELAMIN = "extra_jenis_kelamin";
    public static final String EXTRA_JABATAN_FUNGSIONAL = "extra_jabatan_fungsional";
    public static final String EXTRA_PENDIDIKAN_TERTINGGI = "extra_pendidikan_tertinggi";
    public static final String EXTRA_STATUS_IKATAN_KERJA = "extra_status_ikatan_kerja";
    public static final String EXTRA_STATUS_AKTIVITAS = "extra_status_aktivitas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dosen);

        CircleImageView civPhoto = findViewById(R.id.civ_photo);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvJenisKelamin = findViewById(R.id.tv_jenis_kelamin);
        TextView tvJabatanFungsional = findViewById(R.id.tv_jabatan_fungsional);
        TextView tvPendidikanTertinggi = findViewById(R.id.tv_pendidikan_tertinggi);
        TextView tvStatusIkatanKerja = findViewById(R.id.tv_status_ikatan_kerja);
        TextView tvStatusAktivitas = findViewById(R.id.tv_status_aktivitas);

        civPhoto.setImageDrawable(ContextCompat.getDrawable(this, getIntent().getIntExtra(EXTRA_PHOTO, 0)));
        tvName.setText(getIntent().getStringExtra(EXTRA_NAME));
        tvJenisKelamin.setText(getIntent().getStringExtra(EXTRA_JENIS_KELAMIN));
        tvJabatanFungsional.setText(getIntent().getStringExtra(EXTRA_JABATAN_FUNGSIONAL));
        tvPendidikanTertinggi.setText(getIntent().getStringExtra(EXTRA_PENDIDIKAN_TERTINGGI));
        tvStatusIkatanKerja.setText(getIntent().getStringExtra(EXTRA_STATUS_IKATAN_KERJA));
        tvStatusAktivitas.setText(getIntent().getStringExtra(EXTRA_STATUS_AKTIVITAS));

        Button btnKembali = findViewById(R.id.btn_kembali);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}