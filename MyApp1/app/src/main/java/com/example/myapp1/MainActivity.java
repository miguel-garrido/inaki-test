package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Se invoca onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // La actividad se está iniciando y está a punto de hacerse visible.
        Toast.makeText(this, "Se invoca OnStart" , Toast.LENGTH_SHORT).show();


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            LocalDate date1 = LocalDate.of(2024, Month.AUGUST, 14);
            LocalDate today = LocalDate.now();
            Toast.makeText(this, "Hoy:" + today.toString(), Toast.LENGTH_LONG).show();
            Toast.makeText(this, "Fecha meta:" + date1.toString(), Toast.LENGTH_LONG).show();
            long diasFaltantes = Duration.between(today.atStartOfDay(), date1.atStartOfDay()).toDays();
            Toast.makeText(this, "Faltan " + diasFaltantes + " días", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // La actividad ya se volvió visible, es decir, se reanuda.
        Toast.makeText(this, "Se invoca OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // La actividad está a punto de detenerse (quizá por otra actividad)
        Toast.makeText(this, "Se invoca OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // La actividad ya se detuvo y ya no es visible
        Toast.makeText(this, "Se invoca OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // La actividad será destruida
        Toast.makeText(this, "Se invoca OnDestroy", Toast.LENGTH_SHORT).show();
    }
}