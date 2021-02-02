package fr.iutlens.bucamppodevin.recilist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import fr.iutlens.bucamppodevin.recilist.R;

public class LoadingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        //redirection vers la page principale "MainActiviy" après 2 secondes.
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
        new Handler().postDelayed(runnable, 2000);

    }

}