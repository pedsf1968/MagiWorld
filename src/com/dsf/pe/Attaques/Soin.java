package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class Soin extends Attaque {
    // CONSTRUCTOR
    public Soin() {
        this.nom = "Soin";
    }

    // OVERRIDES METHODS
    @Override
    /**
     * Implémentation de la méthode Combat
     * Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
     * Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return return  si la victime est toujours vivante false sinon
     */
    public boolean Combat(Personnage bourreau, Personnage victime) {
        int avantages = bourreau.getIntelligence()*2;
        int vie = bourreau.getVie()+ avantages;

        if(vie < bourreau.getVieInitiale())
            bourreau.setVie(vie);
        else
            bourreau.setVie(bourreau.getVieInitiale());

        System.out.println(bourreau.getNom()+" utilise " + this.nom + " et gagne "+ avantages+" en vitalité");
        return true;

    }
}
