package com.dsf.pe;


import com.dsf.pe.Personnages.Guerrier;
import com.dsf.pe.Personnages.Mage;
import com.dsf.pe.Personnages.Personnage;
import com.dsf.pe.Personnages.Rodeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttaquesTest {
    Personnage guerrier = new Guerrier(50,50,30,20);
    Personnage rodeur = new Rodeur(50,20,50,30);
    Personnage mage = new Mage(50,25,25,50);

    @Test
    public void Given_GuerrierAndRodeur_When_AttaqueBasique_Then_VieMoinsForce(){
        int vie = rodeur.getVie()-guerrier.getForce();
        guerrier.attaqueBasique.Combat(guerrier, rodeur);
        assertEquals(0,vie-rodeur.getVie(),"" );
    }

    @Test
    public void Given_GuerrierAndMage_When_AttaqueSpeciale_Then_VieMoins2ForceEtForceDemi(){
        int vie = mage.getVie()-guerrier.getForce()*2;
        int force = guerrier.getForce()/2;
        guerrier.attaqueSpeciale.Combat(guerrier,mage);
        assertEquals(0, vie-mage.getVie(),"");
        assertEquals(0,force-guerrier.getForce(),"");
    }
    @Test
    public void Given_RodeurAndGuerrier_When_AttaqueBasique_Then_VieMoinsAgilite(){
        int vie = guerrier.getVie()-rodeur.getAgilite();
        rodeur.attaqueBasique.Combat(rodeur, guerrier);
        assertEquals(0,vie-guerrier.getVie(),"" );
    }

    @Test
    public void Given_RodeurAndMage_When_AttaqueSpeciale_Then_AgilitePlusNiveauDemi(){
        int agilite = rodeur.getAgilite()+rodeur.getNiveau()/2;
        int agilitemax = rodeur.getNiveau()-rodeur.getForce()-rodeur.getIntelligence();

        if (agilite>agilitemax) agilite = agilitemax;

        rodeur.attaqueSpeciale.Combat(rodeur, mage);
        assertEquals(0,agilite-rodeur.getAgilite(),"" );
    }

    @Test
    public void Given_MageAndGuerrier_When_AttaqueBasique_ThenVieDecreaseIntelligence() {
        int vie = guerrier.getVie()-mage.getIntelligence();
        mage.attaqueBasique.Combat(mage,guerrier);
        assertEquals(0, vie-guerrier.getVie(),"");
    }

    @Test
    public void Given_MageAndRodeur_When_AttaqueSpeciale_ThenVieIncrease2Intelligence(){
        int vie = mage.getVie()+mage.getIntelligence()*2;

        if (vie>mage.getVieInitiale()) vie = mage.getVieInitiale();

        mage.attaqueSpeciale.Combat(mage,rodeur);
        assertEquals(0,vie-mage.getVie(),"");
    }
}
