package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        setupButton();
    }

    private void setupButton() {
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initWidgets() {
        ednumero=findViewById(R.id.ednumero);
        tvResultado=findViewById(R.id.tvResultado);
        btnCalcular= findViewById(R.id.btnCalcular);

    }
}