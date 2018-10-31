package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.Attaque;

public abstract class Personnage {
    // force + agilite + intelligence = niveau
    protected String type;          // classe du personnage
    protected String nom;           // nom du personnage
    private int niveau;             // choisie par le joueur entre 0 et 100
    private int vie;                // niveau de vie en cours de jeu ne peu dépasser le niveau de vieInitiale
    protected int vieInitiale;        // niveau du joueur *5
    private int force;              // choisie par le joueur entre 0 et niveau
    private int agilite;            // choisie par le joueur entre 0 et niveau
    private int intelligence;       // choisie par le joueur entre 0 et niveau
    public Attaque attaqueBasique;  // attaque basique
    public Attaque attaqueSpeciale; // attaque spéciale

    // CONSTRUCTOR
    public Personnage(String nom, int niveau, int force, int agilite, int intelligence) {
        this.nom = nom;
        setNiveau(niveau);
        this.vieInitiale = niveau*5;
        this.setVie(niveau*5);
        this.setForce(force);
        this.setAgilite(agilite);
        this.setIntelligence( intelligence);
    }

    // GETTERS
    public String getNom() { return nom; }

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
    public void setNiveau(int niveau) {
        if( niveau>=1&&niveau<=100)
            this.niveau = niveau;
    }

    public void setVie(int vie) {
        if( vie <=this.vieInitiale)
            this.vie = vie;
        else
            this.vie = this.getVieInitiale();
    }

    public void setForce(int force) {
        if( force>=0&&force<=100)
            if(force+this.agilite+this.intelligence<=niveau)
                this.force = force;
            else
                this.force = niveau-this.agilite-this.intelligence;
    }

    public void setAgilite(int agilite) {
        if( agilite>=0 && agilite<=100)
            if(this.force+agilite+this.intelligence<=niveau)
                this.agilite = agilite;
            else
                this.agilite = niveau-this.force-this.intelligence;

    }

    public void setIntelligence(int intelligence) {
        if( intelligence>=0 && intelligence<=100)
            if(this.force+this.agilite+intelligence<=niveau)
                this.intelligence = intelligence;
            else
                this.intelligence = niveau-this.force-this.agilite;

    }


    //OVERRIDES METHODS
    @Override
    public String toString() {
        return "je suis le " + type +
                            " " + nom +
                            " niveau " + niveau +
                            " je possède " + vie +
                            " de vitalité, " + force +
                            " de force, " + agilite +
                            " d'agilité et " + intelligence + " d'intelligence !";
    }
}
