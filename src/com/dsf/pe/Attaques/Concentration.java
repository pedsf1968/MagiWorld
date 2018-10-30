package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class Concentration extends Attaque {
    public Concentration() {
        this.nom = "Concentration";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Le joueur gagne son niveau divisé par 2 en agilité.
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {

        int agilitebourreau = bourrean.getAgilite() + bourrean.getNiveau()/2;
        bourrean.setAgilite(agilitebourreau);
        return true;
    }
}
