package com.ryuguuchan.outilpourlangagedessignes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

public class SigneDicoActivity extends AppCompatActivity {

    private String L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signe_dico);
        Bundle B = getIntent().getExtras();
        if (B != null)
            L = B.getString("Lettre");
        else
        {
            // erreur!
        }
    }

    @Override
    protected void onStart()
    {
        // creation des elements

        super.onStart();
    }

    protected void onResume()
    {
        super.onResume();
    }
  // WIP
}
