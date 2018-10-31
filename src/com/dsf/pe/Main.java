package com.dsf.pe;
public class Main {

    private static int NOMBRE_JOUEURS = 2; //define 2 characters

     /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        jeu.initialise(NOMBRE_JOUEURS);
        jeu.execute();
    }
}
