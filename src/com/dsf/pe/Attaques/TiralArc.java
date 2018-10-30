package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class TiralArc extends Attaque {
    public TiralArc() {
        this.nom = "Tir à l'Arc";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {
        int vie = victime.getVie();
        vie -= bourrean.getAgilite();

        if( vie>0) {
            victime.setVie(vie);
            return true;
        } else {
            victime.setVie(0);
            return false;
        }
    }
}
