package com.example.recilist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        //redirection vers la page principale "MainActiviy" après 3 secondes.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //Démarrage de la page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        //Handler post delayed
        new Handler().postDelayed(runnable, 3000);

    }

}