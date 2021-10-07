package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText ednumero;
        private TextView tvResultado;
        private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
    }

    private void initWidgets() {
        ednumero=findViewById(R.id.ednumero);
        tvResultado=findViewById(R.id.tvResultado);
        btnCalcular= findViewById(R.id.btnCalcular);

    }
}