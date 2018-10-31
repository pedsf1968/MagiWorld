package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.Concentration;
import com.dsf.pe.Attaques.TiralArc;

public class Rodeur extends Personnage {

    // CONSTRUCTOR
    public Rodeur(String nom, int niveau, int force, int agilite, int intelligence) {
        super(nom, niveau, force, agilite, intelligence);
        this.type = "Rodeur";
        this.attaqueBasique = new TiralArc();
        this.attaqueSpeciale = new Concentration();
    }
}
