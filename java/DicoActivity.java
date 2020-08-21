package com.ryuguuchan.outilpourlangagedessignes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dico);
    }

    private Signe[][] Elements =
    {
            {
                // A
                // new Signe("À cause de", )
                    // TODO
                    // Faire des illustrations afin d'en faire d'eux d'animation *.gif
            }
    };

    public void alphabet_click(View view) {
        Button actual_button = (Button)view;
        Intent I = new Intent(this, SigneDicoActivity.class);
        Bundle B = new Bundle();
        B.putString("Lettre", actual_button.getText().toString());
        startActivity(I);
    }
}
