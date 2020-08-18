package com.ryuguuchan.outilpourlangagedessignes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Boolean AlertDone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Vous utilisez la demo gratuite de l'application qui va venir, les outils ne sont pas tous disponible");
        alert.setTitle("AVERTISSEMENT");
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // rien du tout pour le momment
                // rediriger vers la version complete lorsque que celui - ci est publie
            }
        });
        if (AlertDone == false) {
            alert.create().show();
            AlertDone = true;
        }

        super.onStart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    // lorsque l'utilisateur choisit "dictionnaire"
    public void DictionaryClick(View view) {
        Intent I = new Intent(this, DicoActivity.class);
        startActivity(I);
    }

    // lorsque l'utilisateur veut contacter le dev
    public void ContactClick(View view) {
        String mailto = "mailto:ryuguuchan@gmail.com?cc=&subject=Commentaire&body";
        Intent Imail = new Intent(Intent.ACTION_SENDTO);
        Imail.setData(Uri.parse(mailto));
        try
        {
            startActivity(Imail);
        }
        catch (ActivityNotFoundException e)
        {
            Toast.makeText(this, "Impossible d'ouvrir l'application pour envoyer un mail", Toast.LENGTH_SHORT).show();
        }
    }

    // lorsque l'utilisateur clique sur un truc qui n'est pas dispo dans la demo
    public void noEnableClick(View view) {
        Toast.makeText(this,"Indisponible dans ce demo gratuit", Toast.LENGTH_SHORT).show();
    }
}
