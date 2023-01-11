package com.falahrafi.latihan.pammaml03;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListDosenAdapter extends RecyclerView.Adapter<ListDosenAdapter.ListViewHolder> {

    private ArrayList<Dosen> listDosen;

    public ListDosenAdapter(ArrayList<Dosen> list){
        this.listDosen = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_dosen, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Dosen dosen = listDosen.get(position);

        Glide.with(holder.itemView.getContext())
                .load(dosen.getPhoto())
                .apply(new RequestOptions().override(64, 64))
                .into(holder.imgPhoto);
        holder.tvName.setText(dosen.getName());

        holder.cvDosenList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDetailDosen = new Intent(v.getContext(), DetailDosenActivity.class);
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_PHOTO, dosen.getPhoto());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_NAME, dosen.getName());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_JENIS_KELAMIN, dosen.getJenisKelamin());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_JABATAN_FUNGSIONAL, dosen.getJabatanFungsional());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_PENDIDIKAN_TERTINGGI, dosen.getPendidikanTertinggi());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_STATUS_IKATAN_KERJA, dosen.getStatusIkatanKerja());
                iDetailDosen.putExtra(DetailDosenActivity.EXTRA_STATUS_AKTIVITAS, dosen.getStatusAktivitas());
                v.getContext().startActivity(iDetailDosen);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDosen.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        CardView cvDosenList;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            cvDosenList = itemView.findViewById(R.id.cv_dosen_list);
        }
    }

}
