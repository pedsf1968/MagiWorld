package com.dsf.pe.Personnages;

import com.dsf.pe.Attaques.CoupdEpee;
import com.dsf.pe.Attaques.CoupdeRage;

public class Guerrier extends Personnage {

    public Guerrier(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
        this.type = "Guerrier";
        this.attaqueBasique = new CoupdEpee();
        this.attaqueSpeciale = new CoupdeRage();
    }
}
