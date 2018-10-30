package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class Soin extends Attaque {
    public Soin() {
        this.nom = "Soin";
    }

    @Override
    /**
     * Implémentation de la méthode Combat
     * Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
     * Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
     */
    public boolean Combat(Personnage bourrean, Personnage victime) {
        int vie = bourrean.getVie()+ bourrean.getIntelligence()*2;

        if(vie < bourrean.getVieInitiale())
            bourrean.setVie(vie);
        else
            bourrean.setVie(bourrean.getVieInitiale());

        return true;

    }
}
