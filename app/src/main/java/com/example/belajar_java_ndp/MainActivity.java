package com.example.belajar_java_ndp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button pindahActivity1;
    Button pindahActivity2;
    Button pindahActivity3;
    Button pindahActivity4;
    Button pindahActivity5;
    Button pindahActivity6;
    Button pindahActivity7;
    Button pindahActivity8;
    Button pindahActivity9;
    Button pindahActivity10;
    Button pindahActivity11;
    Button pindahActivity12;
    Button pindahActivity13;
    Button pindahActivity14;
    Button pindahActivity15;
    Button pindahActivity16;
    Button pindahActivity17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide(); // Remove Header
        setContentView(R.layout.activity_main);

        pindahActivity1 = findViewById(R.id.btnSubmit); // Untuk Rangking Pengguna
        pindahActivity2 = findViewById(R.id.btnSubmit2); // Untuk List Pertanyaan
        pindahActivity3 = findViewById(R.id.btnSubmit3); // Untuk List Pemberitahuan
        pindahActivity4 = findViewById(R.id.btnSubmit4); // Untuk List Pemberitahuan
        pindahActivity5 = findViewById(R.id.btnSubmit5); // Untuk Ganti Password
        pindahActivity6 = findViewById(R.id.btnSubmit6); // Untuk pengaturan
        pindahActivity7 = findViewById(R.id.btnSubmit7); // Untuk Ganti Nama
        pindahActivity8 = findViewById(R.id.btnSubmit8); // Untuk Detail Pengguna
        pindahActivity9 = findViewById(R.id.btnSubmit9); // Untuk Ganti No telp
        pindahActivity10 = findViewById(R.id.btnSubmit10); //jawab_view
        pindahActivity11 = findViewById(R.id.btnSubmit11); //filter
        pindahActivity12 = findViewById(R.id.btnSubmit12); //tambah_jawaban
        pindahActivity13 = findViewById(R.id.btnSubmit13); //pertanyaan terpilih
        pindahActivity14 = findViewById(R.id.btnSubmit14); //tanpa akun
        pindahActivity15 = findViewById(R.id.btnSubmit15);
        pindahActivity16 = findViewById(R.id.btnSubmit16);
        pindahActivity17 = findViewById(R.id.btnSubmit17);
        // Function Rangking Pengguna Ketika di klik
        pindahActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKeRangkinPengguna = new Intent(MainActivity.this,RangkingUser.class);
                startActivity(pindahKeRangkinPengguna);
            }
        });

        // Function List Pertanyaan Ketika di klik
        pindahActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent pindahKeListPertanyaan = new Intent(MainActivity.this, KumpulanPertanyaan.class);
                startActivity(pindahKeListPertanyaan);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKePemberitahuan = new Intent(MainActivity.this, Pemberitahuan.class);
                startActivity(pindahKePemberitahuan);
            }
        });


        // Function Pemberitahuan Ketika di klik
        pindahActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TambahPertanyaan = new Intent(MainActivity.this, TambahPertanyaan.class);
                startActivity(TambahPertanyaan);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GantiPassword = new Intent(MainActivity.this, gantipassword.class);
                startActivity(GantiPassword);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pengaturan = new Intent(MainActivity.this, Pengaturan.class);
                startActivity(Pengaturan);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GantiNama = new Intent(MainActivity.this, gantinama.class);
                startActivity(GantiNama);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DetailPengguna = new Intent(MainActivity.this, detailpengguna.class);
                startActivity(DetailPengguna);
            }
        });

        // Function Pemberitahuan Ketika di klik
        pindahActivity9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GantiNotelp = new Intent(MainActivity.this, gantinotelpon.class);
                startActivity(GantiNotelp);
            }
        });
        pindahActivity10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pilih_view = new Intent(MainActivity.this, pilih_view.class);
                startActivity(pilih_view);
            }
        });
        pindahActivity11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent filter = new Intent(MainActivity.this, filter.class);
                startActivity(filter);
            }
        });
        pindahActivity12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tambah_jawaban = new Intent(MainActivity.this, tambah_jawaban.class);
                startActivity(tambah_jawaban);
            }
        });
        pindahActivity13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jawaban_view = new Intent(MainActivity.this, jawaban_view.class);
                startActivity(jawaban_view);
            }
        });
        pindahActivity14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tanpa_akun = new Intent(MainActivity.this, tanpa_akun.class);
                startActivity(tanpa_akun);
            }
        });
        pindahActivity15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(MainActivity.this, masuk.class);
                startActivity(masuk);
            }
        });
        pindahActivity16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selamat_datang= new Intent(MainActivity.this, selamat_datang.class);
                startActivity(selamat_datang);
            }
        });
        pindahActivity17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selamat_datang= new Intent(MainActivity.this, selamat_datang.class);
                startActivity(selamat_datang);
            }
        });





    }
}