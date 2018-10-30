package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class BouledeFeu extends Attaque {
    public BouledeFeu() {
        this.nom = "Boule de Feu";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
     */
    public boolean Combat(Personnage bourreau, Personnage victime) {
        int vie = victime.getVie();

        vie -= bourreau.getIntelligence();

        if( vie>0) {
            victime.setVie(vie);
            return true;
        } else {
            victime.setVie(0);
            return false;
        }
    }
}
