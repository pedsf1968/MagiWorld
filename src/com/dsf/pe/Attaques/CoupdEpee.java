package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class CoupdEpee extends Attaque {
    public CoupdEpee() {
        this.nom = "Coup d'Epée";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à la force du joueur sur l’adversaire.
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {
        int vie = victime.getVie();
        vie -= bourrean.getForce();

        if( vie>0) {
            victime.setVie(vie);
            return true;
        } else {
            victime.setVie(0);
            return false;
        }
    }
}
