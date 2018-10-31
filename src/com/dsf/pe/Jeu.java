package com.dsf.pe;

import com.dsf.pe.Personnages.Guerrier;
import com.dsf.pe.Personnages.Mage;
import com.dsf.pe.Personnages.Personnage;
import com.dsf.pe.Personnages.Rodeur;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Jeu {
    private int nombrePersonnage;
    Map<Integer,Personnage> personnages= new HashMap<Integer,Personnage>();
    Scanner sc = new Scanner(System.in);

    /**
     * Initialise the game
      * @param nombrejoueurs number of users
     * @return a HashMap who contain all characters
     */
    public Map<Integer, Personnage> Initialise(int nombrejoueurs){
        nombrePersonnage = 0;
        for(int i=0;i<nombrejoueurs;i++){
            System.out.println("Création du personnage du Joueur " + i);
            // Ask type of personnage and parameters to the user
            int type = askSomething("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)" ,1,3);
            int niveau = askSomething("Niveau du personnage ?",0,100);
            int force = askSomething("Force du personnage ?",0,100);
            int agilite = askSomething("Agilité du personnage",0,100-force);
            int intelligence = askSomething("Intelligence du personnage", 0,100-force-agilite);

            //Add new personnage depending on the type
            switch (type){
                case 0:
                    addPersonnage(i, new Guerrier(niveau,force,agilite,intelligence));
                    break;
                case 1:
                    addPersonnage(i, new Rodeur(niveau,force,agilite,intelligence));
                    break;
                case 2:
                    addPersonnage(i, new Mage(niveau,force,agilite,intelligence));
                    break;
            }
        }
        return personnages;
    }

    /**
     * Add personnage in the HashMap
     * @param numero the index of the personnage
     * @param personnage the type of personnage
     */
    private void addPersonnage(int numero, Personnage personnage){
        this.personnages.put(numero,personnage);
        this.nombrePersonnage+=1;
    }


    /**
     * Ask something to the user displaying a message. test if the result is in the range
     * @param message to display
     * @param min value of the range
     * @param max value of the range
     * @return the value selected by the user
     */
    public int askSomething(String message, int min, int max){
        int reponse = -1;
        boolean responseIsGood = false;

        System.out.println(message);

        do {
            try {
                reponse = sc.nextInt();
                responseIsGood = (reponse >= min && reponse <= max);
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Vous devez choisir un niveau entre " + min + " et " + max);
                responseIsGood = false;
            }
        } while(!responseIsGood);

        return reponse;
    }

}
