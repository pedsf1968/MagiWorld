package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public abstract class Attaque {
    protected  String nom;

    public abstract void Combat(Personnage victime);
}
