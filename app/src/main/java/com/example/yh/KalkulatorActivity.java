package com.example.yh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorActivity extends AppCompatActivity {
    Button tambah, kurang, bagi, kali;
    EditText text1, text2;
    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        bagi = findViewById(R.id.bagi);
        kali = findViewById(R.id.kali);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        clear = findViewById(R.)
        result = findViewById(R.id.result);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("")){
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                }else if(text2.getText().toString().equals("")){
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a, b, c;
                    a = Float.parseFloat(text1.getText().toString());
                    b = Float.parseFloat(text2.getText().toString());
                    c = a + b;
                    result.setText("Hasilnya adalah " +c);
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else if (text2.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(text1.getText().toString());
                    b = Float.parseFloat(text2.getText().toString());
                    c = a - b;
                    result.setText("Hasilnya adalah " + c);
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else if (text2.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(text1.getText().toString());
                    b = Float.parseFloat(text2.getText().toString());
                    c = a / b;
                    result.setText("Hasilnya adalah " + c);
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else if (text2.getText().toString().equals("")) {
                    Toast.makeText(KalkulatorActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(text1.getText().toString());
                    b = Float.parseFloat(text2.getText().toString());
                    c = a * b;
                    result.setText("Hasilnya adalah " + c);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a, b, c;
                text1.setText("");
                text2.setText("");
                result.setText("");
            }
        });
    }
}