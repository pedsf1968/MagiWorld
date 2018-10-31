package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class CoupdEpee extends Attaque {
    // CONSTRUCTOR
    public CoupdEpee() {
        this.nom = "Coup d'Epée";
    }

    // OVERRIDES METHODS
    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à la force du joueur sur l’adversaire.
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return true si la victime est toujours vivante false sinon
     */
    public boolean Combat(Personnage bourreau, Personnage victime) {
        int dommages = bourreau.getForce();
        int vie = victime.getVie() - dommages;

        System.out.println(bourreau.getNom()+" utilise " + this.nom + " et inflige "+ dommages + " dommages.");
        System.out.println(victime.getNom()+" perd "+ dommages + " points de vie");

        if( vie>0) {
            victime.setVie(vie);
            return true;
        } else {
            victime.setVie(0);
            System.out.println(victime.getNom()+ " est mort");
            System.out.println(victime.getNom()+ " a perdu !");
            return false;
        }
    }
}
