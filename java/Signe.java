package com.ryuguuchan.outilpourlangagedessignes;

import android.media.Image;

public class Signe {
    public String mot;
    public Image signe;
    public Character Lettre;

    public Signe(String Mot, Image _signe, Character _lettre)
    {
        mot = Mot;
        signe = _signe;
        Lettre = _lettre;
    }

    // tout les prives ici
}
