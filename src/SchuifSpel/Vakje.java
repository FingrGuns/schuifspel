/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchuifSpel;

/**
 *
 * @author Tim Gysen
 */
public class Vakje {
    private Kleur kleur;
    
    public Vakje(){
        kleur = Kleur.LEEG;
    }


    public Kleur getKleur() {
        return kleur;
    }
    public void setKleur(Kleur k) {
        kleur = k;
    }
    
}
