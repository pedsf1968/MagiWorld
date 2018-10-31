package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class TiralArc extends Attaque {
    // CONSTRUCTOR
    public TiralArc() {
        this.nom = "Tir à l'Arc";
    }

    // OVERRIDES METHODS
    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return return  si la victime est toujours vivante false sinon
     */
    public boolean Combat(Personnage bourreau, Personnage victime) {
        int dommages = bourreau.getAgilite();
        int vie = victime.getVie()- dommages;

        System.out.println(bourreau.getNom()+" utilise " + this.nom + " et inflige "+ dommages + " dommages.");

        if( vie>0) {
            victime.setVie(vie);
            System.out.println(victime.getNom()+" perd "+ dommages + " points de vie");
            return true;
        } else {
            victime.setVie(0);
            System.out.println(victime.getNom()+ " est mort");
            System.out.println(victime.getNom()+ " a perdu !");
            return false;
        }
    }
}
