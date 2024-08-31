package com.iudigital.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000; // Duración del Splash: 3000 ms = 3 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Usar un Handler para introducir un retardo
        new Handler().postDelayed(() -> {
            // Después de 3 segundos, se inicia la MainActivity
            Intent mainIntent = new Intent(SplashActivity.this, MainActivity2.class);
            startActivity(mainIntent);
            finish(); // Finaliza la SplashActivity para que no pueda volver atrás
        }, SPLASH_DISPLAY_LENGTH);
    }
}
