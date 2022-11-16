package com.example.proyek1niananiati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity3 extends AppCompatActivity {

        String kepada;
        String sbjk;
        String pesan;
        EditText eKepada;
        EditText ePesan;
        EditText eSubyek;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_linear3);
            kepada = getIntent().getExtras().getString("kepada");
            sbjk = getIntent().getExtras().getString("subyek");
            pesan = getIntent().getExtras().getString("pesan");

            eKepada = findViewById(R.id.kepadaa);
            eSubyek = findViewById(R.id.subyekk);
            ePesan = findViewById(R.id.pesann);


            eKepada.setText(kepada);
            eSubyek.setText(sbjk);
            ePesan.setText(pesan);
        }
    }

