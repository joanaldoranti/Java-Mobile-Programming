package com.example.inputoutput;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etMassa, etKecepatan;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMassa = findViewById(R.id.etMassa);
        etKecepatan = findViewById(R.id.etKecepatan);
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void hitungEnergiKinetik(View v) {
        String massaStr = etMassa.getText().toString();
        String kecepatanStr = etKecepatan.getText().toString();

        if (massaStr.isEmpty() || kecepatanStr.isEmpty()) {
            tvHasil.setText("Masukkan massa dan kecepatan terlebih dahulu!");
            return;
        }

        try {
            double massa = Double.parseDouble(massaStr);
            double kecepatan = Double.parseDouble(kecepatanStr);

            double energiKinetik = 0.5 * massa * kecepatan * kecepatan;
            tvHasil.setText("Energi kinetik: " + energiKinetik);

        } catch (NumberFormatException e) {
            tvHasil.setText("Input harus berupa angka!");
        }
    }
}
