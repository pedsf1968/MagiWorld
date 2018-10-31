package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.CoupdEpee;
import com.dsf.pe.Attaques.CoupdeRage;

public class Guerrier extends Personnage {

    // CONSTRUCTOR
    public Guerrier(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence);
        this.type = "Guerrier";
        this.attaqueBasique = new CoupdEpee();
        this.attaqueSpeciale = new CoupdeRage();
    }
}
