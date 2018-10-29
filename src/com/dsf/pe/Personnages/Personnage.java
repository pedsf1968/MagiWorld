package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.Attaque;

public abstract class Personnage {
    // force + agilite + intelligence = niveau
    protected String type;        // nom du type de personnage
    private int niveau;         // choisie par le joueur entre 0 et 100
    private int vie;            // niveau de vie en cours de jeu ne peu dépasser le niveau de vieInitiale
    private int vieInitiale;    // niveau du joueur *5
    private int force;          // choisie par le joueur entre 0 et 100
    private int agilite;        // choisie par le joueur entre 0 et 100
    private int intelligence;   // choisie par le joueur entre 0 et 100
    private Attaque attaqueBasique;
    private Attaque attaqueSpeciale;

    // GETTERS

    public String getType() {
        return type;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
