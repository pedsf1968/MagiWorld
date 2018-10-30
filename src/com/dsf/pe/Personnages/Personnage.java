package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.Attaque;

public abstract class Personnage {
    // force + agilite + intelligence = niveau
    protected String type;        // nom du type de personnage
    private int niveau;         // choisie par le joueur entre 0 et 100
    private int vie;            // niveau de vie en cours de jeu ne peu dépasser le niveau de vieInitiale
    private int vieInitiale;    // niveau du joueur *5
    private int force;          // choisie par le joueur entre 0 et niveau
    private int agilite;        // choisie par le joueur entre 0 et niveau
    private int intelligence;   // choisie par le joueur entre 0 et niveau
    public Attaque attaqueBasique;
    public Attaque attaqueSpeciale;

    public Personnage(int niveau, int force, int agilite, int intelligence) {
        setNiveau(niveau);
        this.vie = niveau*5;
        this.vieInitiale = niveau*5;
        this.setForce(force);
        this.setAgilite(agilite);
        this.setIntelligence( intelligence);
    }

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

    public int getVieInitiale() {
        return vieInitiale;
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

    // SETTERS

    public void setType(String type) {
        this.type = type;
    }

    public void setNiveau(int niveau) {
        if( niveau>=1&&niveau<=100)
            this.niveau = niveau;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        if( force>=0)
            if(this.force+this.agilite+this.intelligence<=niveau)
                this.force = force;
            else
                this.force = niveau-this.agilite-this.intelligence;
    }

    public void setAgilite(int agilite) {
        if( agilite>=0)
            if(this.force+this.agilite+this.intelligence<=niveau)
                this.agilite = agilite;
            else
                this.agilite = niveau-this.force-this.intelligence;

    }

    public void setIntelligence(int intelligence) {
        if( intelligence>=0)
            if(this.force+this.agilite+this.intelligence<=niveau)
                this.intelligence = intelligence;
            else
                this.intelligence = niveau-this.force-this.agilite;

    }

    public void setAttaqueBasique(Attaque attaqueBasique) {
        this.attaqueBasique = attaqueBasique;
    }

    public void setAttaqueSpeciale(Attaque attaqueSpeciale) {
        this.attaqueSpeciale = attaqueSpeciale;
    }
}
