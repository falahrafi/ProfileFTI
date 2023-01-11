package com.falahrafi.latihan.pammaml03;

import java.sql.Array;
import java.util.ArrayList;

public class DosensData {

    private static String[] dosenNames = {
            "Eddy Nurraharjo, S.T., M.Cs",
            "Sariyun Naja Anwar, B.Sc, M.Msi",
            "R. Soelistijadi, S.Sos, M.Kom",
            "Heribertus Yulianton, S.Si., M.Cs",
            "Veronica Lusiana, S.T., M.Kom",

            "Isworo Nugroho, S.E., A.Kp, M.Kom",
            "Drs. Edy Supriyanto, M.Kom",
            "Rara Sri Artati Rejeki, S.E., M.Kom",
            "Herny Februariyanti, S.T., M.Cs",
            "Teguh Khristianto, S.Kom, M.Kom",

            "Purwatiningtyas, S.E., M.Kom",
            "Sunardi, S.Kom., M.Cs",
            "Eko Nur Wahyudi, S.Kom, M.Cs",
            "Hersatoto Listiyono, S.Kom, M.Cs",
            "Sri Mulyani, M.Kom"
    };

    private static String[] dosenProgdi = {
            "Teknik Informatika",
            "Teknik Informatika",
            "Teknik Informatika",
            "Teknik Informatika",
            "Teknik Informatika",

            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",
            "Sistem Informasi",

            "Manajemen Informatika",
            "Manajemen Informatika",
            "Manajemen Informatika",
            "Manajemen Informatika",
            "Manajemen Informatika"
    };

    private static String[] dosenJenisKelamin = {
            "Laki-Laki",
            "Laki-Laki",
            "Laki-Laki",
            "Laki-Laki",
            "Perempuan",

            "Laki-Laki",
            "Laki-Laki",
            "Perempuan",
            "Perempuan",
            "Laki-Laki",

            "Perempuan",
            "Laki-Laki",
            "Laki-Laki",
            "Laki-Laki",
            "Perempuan"
    };

    private static String[] dosenJabatanFungsional = {
            "Lektor",
            "Lektor Kepala",
            "Lektor",
            "Asisten Ahli",
            "Lektor",

            "Lektor Kepala",
            "Lektor",
            "Lektor",
            "Lektor Kepala",
            "Asisten Ahli",

            "Lektor Kepala",
            "Asisten Ahli",
            "Lektor",
            "Lektor",
            "Lektor"
    };

    private static String[] dosenPendidikanTertinggi = {
            "S2",
            "S2",
            "S2",
            "S2",
            "S2",

            "S2",
            "S2",
            "S2",
            "S2",
            "S2",

            "S2",
            "S2",
            "S2",
            "S2",
            "S2"
    };

    private static String[] dosenStatusIkatanKerja = {
            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",

            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen Tetap",

            "Dosen Tetap",
            "Dosen Tetap",
            "Dosen PNS DPK",
            "Dosen Tetap",
            "Dosen Tetap",
    };

    private static String[] dosenStatusAktivitas = {
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",

            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",

            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif",
            "Aktif"
    };

    private static int[] dosenImages = {
            R.drawable.photo_eddy_nurraharjo,
            R.drawable.photo_sariyun_naja_anwar,
            R.drawable.photo_r_soelistijadi,
            R.drawable.photo_heribertus_yulianton,
            R.drawable.photo_veronica_lusiana,

            R.drawable.photo_isworo_nugroho,
            R.drawable.photo_edy_supriyanto,
            R.drawable.photo_rara_sriartati_redjeki,
            R.drawable.photo_herny_februarianty,
            R.drawable.photo_dummy,

            R.drawable.photo_purwatiningtyas,
            R.drawable.photo_sunardi,
            R.drawable.photo_eko_nur_wahyudi,
            R.drawable.photo_hersatoto_listiyono,
            R.drawable.photo_sri_mulyani
    };

    static ArrayList<Dosen> getListData(String progdi) {
        ArrayList<Dosen> list = new ArrayList<>();

        for (int position = 0; position < dosenNames.length; position++){
            Dosen dosen = new Dosen();
            dosen.setName(dosenNames[position]);
            dosen.setJenisKelamin(dosenJenisKelamin[position]);
            dosen.setJabatanFungsional(dosenJabatanFungsional[position]);
            dosen.setPendidikanTertinggi(dosenPendidikanTertinggi[position]);
            dosen.setStatusIkatanKerja(dosenStatusIkatanKerja[position]);
            dosen.setStatusAktivitas(dosenStatusAktivitas[position]);
            dosen.setPhoto(dosenImages[position]);

            if(dosenProgdi[position].equals(progdi)){
                list.add(dosen);
            }
        }
        return list;
    }

}
