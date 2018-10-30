package com.dsf.pe.Attaques;

import com.dsf.pe.Personnages.Personnage;

/**
 * Classe utilisée pour générer les classes d'attaque
 * String nom : le nom de l'attaque
 */
public abstract class Attaque {
    protected  String nom;

    /**
     * definition de la méthode abstraite Combat
     * @param bourrean celui qui attaque
     * @param victime celui qui est attaqué
     * @return return true si la victime est toujours vivante false sinon
     */
    public abstract boolean Combat(Personnage bourrean, Personnage victime);
}
