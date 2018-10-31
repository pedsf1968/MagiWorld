package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.BouledeFeu;
import com.dsf.pe.Attaques.Soin;

public class Mage extends Personnage {

    // CONSTRUCTOR
    public Mage(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence);
        this.type = "Mage";
        this.attaqueBasique = new BouledeFeu();
        this.attaqueSpeciale = new Soin();
    }
}
