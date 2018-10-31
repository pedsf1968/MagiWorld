package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class Concentration extends Attaque {
    // CONSTRUCTOR
    public Concentration() {
        this.nom = "Concentration";
    }

    // OVERRIDES METHODS
    @Override
    /**
     * Implémentation de la méthode Combat
     * Le joueur gagne son niveau divisé par 2 en agilité.
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return true si la victime est toujours vivante false sinon
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {
        int avantages =  bourrean.getNiveau()/2;

        bourrean.setAgilite(bourrean.getAgilite()+avantages);
        System.out.println(bourrean.getNom()+" utilise " + this.nom + " et gagne "+ avantages+" en agilité");
        return true;
    }
}
