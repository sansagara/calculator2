package com.leonelatencio.calculator2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Integer digit;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }


    public void digit(android.view.View vista) {
        Button boton = (Button) vista;
        Toast.makeText(this, "Boton apretado: " + boton.getText(), Toast.LENGTH_SHORT).show();
        display.append(boton.getText());
    }



}
