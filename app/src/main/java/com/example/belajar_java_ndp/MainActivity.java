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
        pindahActivity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GantiPassword = new Intent(MainActivity.this, gantipassword.class);
                startActivity(GantiPassword);
            }
        });


    }
}