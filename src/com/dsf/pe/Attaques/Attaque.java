package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

/**
 * Classe utilisée pour générer les classes d'attaque
 * String nom : le nom de l'attaque
 */
public abstract class Attaque {
    protected  String nom;

    // GETTERS
    public String getNom() {
        return nom;
    }

    // METHODS
    /**
     * definition de la méthode abstraite Combat
     * @param bourreau celui qui attaque
     * @param victime celui qui est attaqué
     * @return true s'il n'y a pas de mort false sinon
     */
    public abstract boolean Combat(Personnage bourreau, Personnage victime);
}
