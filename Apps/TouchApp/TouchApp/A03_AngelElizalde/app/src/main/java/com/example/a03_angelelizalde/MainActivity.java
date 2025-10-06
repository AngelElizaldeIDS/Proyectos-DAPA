package com.example.a03_angelelizalde;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvInferior;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Vinculamos vistas
        tvInferior = findViewById(R.id.tvInferior);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        // Evento onClick (Botón 1)
        btn1.setOnClickListener(v -> {
            tvInferior.setText("Detalle: Evento onClick en Botón 1");
            Toast.makeText(this, "Click en Botón 1", Toast.LENGTH_SHORT).show();
        });

        // Evento onLongClick (Botón 2)
        btn2.setOnLongClickListener(v -> {
            tvInferior.setText("Detalle: Evento onLongClick en Botón 2");
            Toast.makeText(this, "LongClick en Botón 2", Toast.LENGTH_SHORT).show();
            return true; // True para indicar que se consumió el evento
        });

        // Evento onFocus (Botón 3)
        btn3.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                tvInferior.setText("Detalle: Botón 3 obtuvo el foco");
                Toast.makeText(this, "Focus en Botón 3", Toast.LENGTH_SHORT).show();
            }
        });

        // Evento onTouch (Botón 4)
        btn4.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                tvInferior.setText("Detalle: Tocando Botón 4");
                Toast.makeText(this, "Touch en Botón 4", Toast.LENGTH_SHORT).show();
            }
            return false; // false permite que siga el comportamiento normal del botón
        });
    }
}
