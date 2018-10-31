package com.dsf.pe;

import com.dsf.pe.Personnages.Guerrier;
import com.dsf.pe.Personnages.Mage;
import com.dsf.pe.Personnages.Personnage;
import com.dsf.pe.Personnages.Rodeur;

import java.util.*;

public class Jeu {
    static int JOUEUR1 = 0;
    static int JOUEUR2 = 1;

    private int nombrePersonnage = 0;
    ArrayList<Personnage> personnages = new ArrayList<Personnage>();
    Scanner sc = new Scanner(System.in);

    /**
     * Initialise the game and the ArrayList of characters
     * @param nombrejoueurs number of users
     */
    public void initialise(int nombrejoueurs){
        for(int i=1;i<=nombrejoueurs;i++){
            System.out.println("Création du personnage du Joueur " + i);
            // Ask class of characters and parameters to the user
            String nom = "Joueur " + i;
            int type = askSomething("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)" ,1,3);
            int niveau = askSomething("Niveau du personnage ?",0,100);
            int force = askSomething("Force du personnage ?",0,100);
            int agilite = askSomething("Agilité du personnage ?",0,100-force);
            int intelligence = askSomething("Intelligence du personnage ?", 0,100-force-agilite);

            //Add new character depending on the type
            switch (type){
                case 1:
                    this.personnages.add( new Guerrier(nom,niveau,force,agilite,intelligence));
                    System.out.println( "Woarg "+ personnages.get(i-1).toString());
                    break;
                case 2:
                    this.personnages.add( new Rodeur(nom,niveau,force,agilite,intelligence));
                    System.out.println( "Shuuut "+ personnages.get(i-1).toString());
                    break;
                case 3:
                    this.personnages.add( new Mage(nom,niveau,force,agilite,intelligence));
                    System.out.println( "Abracadabra "+ personnages.get(i-1).toString());
                    break;
            }
            this.nombrePersonnage+=1;
        }
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


    /**
     * Start the game and give the hand for each users
     */
    public void execute() {
        boolean vivant = true;
        int bourreau = JOUEUR1;
        int victime = JOUEUR2;

        while ( attaque(bourreau, victime)){
            // reverse users
            if(bourreau==JOUEUR1) {
                bourreau = JOUEUR2;
                victime = JOUEUR1;
            } else {
                bourreau = JOUEUR1;
                victime = JOUEUR2;
            }
        }
    }

    /**
     * Ask to the user his choice for the attack and do it
     * @param joueur1 the user who make the attack
     * @param joueur2 the user who is attacked
     * @return true if no one die
     */
    public boolean attaque(int joueur1, int joueur2) {
        String message = personnages.get(joueur1).getNom()+" (" + personnages.get(joueur1).getVie() + " Vitalité) Veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale)";

        if ( askSomething( message,1, 2) == 1 )
            return personnages.get(joueur1).attaqueBasique.Combat(personnages.get(joueur1), personnages.get(joueur2));
        else
            return personnages.get(joueur1).attaqueSpeciale.Combat(personnages.get(joueur1), personnages.get(joueur2));

    }

}
