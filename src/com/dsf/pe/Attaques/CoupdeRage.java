package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class CoupdeRage extends Attaque {
    public CoupdeRage() {
        this.nom = "Coup de Rage";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire.
     * Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {
        int vie = victime.getVie();
        vie -= 2*bourrean.getForce();

        bourrean.setForce(bourrean.getForce()/2);

        if( vie>0) {
            victime.setVie(vie);
            return true;
        } else {
            victime.setVie(0);
            return false;
        }
    }
}
