package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

public class CoupdeRage extends Attaque {
    // CONSTRUCTOR
    public CoupdeRage() {
        this.nom = "Coup de Rage";
    }

    // OVERRIDES METHODS
    @Override
    /**
     * Implémentation de la méthode Combat
     * Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire.
     * Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return true si il n'y a pas de mort false sinon
     */
    public boolean Combat(Personnage bourreau, Personnage victime) {
        int dommagesvictime = 2*bourreau.getForce();
        int dommagesbourreau = bourreau.getForce()/2;
        int vievictime = victime.getVie() - dommagesvictime;
        int viebourreau = bourreau.getVie() - dommagesbourreau;

        System.out.println(bourreau.getNom()+" utilise " + this.nom + " et inflige "+ dommagesvictime + " dommages.");
        System.out.println(victime.getNom()+" perd "+ dommagesvictime + " points de vie");

        if(vievictime>0){
            victime.setVie(vievictime);
        } else {
            victime.setVie(0);
            System.out.println(victime.getNom()+ " est mort");
            System.out.println(victime.getNom()+ " a perdu !");
        }

        System.out.println(bourreau.getNom() + " perd "+ dommagesbourreau + " points de vie");

        if( viebourreau>0) {
            bourreau.setVie(viebourreau);
        } else {
            bourreau.setVie(0);
            System.out.println(bourreau.getNom()+ " est mort");
            System.out.println(bourreau.getNom()+ " a perdu !");
        }

        if( viebourreau*vievictime>0)
            return true;
        else
            return false;
    }
}
