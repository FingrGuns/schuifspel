/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchuifSpel;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Tim Gysen
 */
public class Spelbord {
    private Vakje[][] rooster;
    private int breedte,hoogte;
    private Random r = new Random();;
    private Landen land;
    private ArrayList<Integer> kleuren;
    private int kleurNR;
    private Kleur invulKleur;
    
    public Spelbord(int b, int h, Landen l){
        System.out.println("model gevonden");
        this.kleuren = new ArrayList<>();
        breedte = b;
        hoogte = h;
        land = l;
        initSpelbord(b, h, l);
        
        
    }
    private void initSpelbord(int b, int h, Landen l){
        System.out.println("initSpelbord begonnen ");
        breedte = b;
        hoogte = h;
        rooster  = new Vakje[breedte][hoogte];
        maakLeegSpelbord();
        verspreidKleuren(l);
        
        
    }
    private void maakLeegSpelbord(){
        System.out.println("maakLeegSpelbord begonnen ");
        for (int i=0; i<breedte; i++) {
            for (int j=0; j<hoogte; j++) {
                
                rooster[i][j] = new Vakje();
                
            }
    }
    }
    /**
     * gebaseerd op doolhofFX code op toledo
     * @param x x-coördinaat van het gezochte vakje
     * @param y y-coördinaat van het gezochte vakje
     * @return het vakje op die positie
     */
    Vakje getVakjeOp(int x, int y) {
        return rooster[x][y];
    }
    Vakje getVakjeRechts(int x,int y){
        return rooster[x + 1][y];
    }
    Vakje getVakjeLinks(int x, int y){
        return rooster[x - 1][y];
    }
    Vakje getVakjeBoven(int x, int y){
        return rooster[x][y - 1];
    }
    Vakje getVakjeOnder(int x, int y){
        return rooster[x][y + 1];
    }
    
    /**
     * 
     * @param l het gekozen land
     * 
     */
    public void landKiezen(Landen l){
        System.out.println("landKiezen begonnen ");
        land = l;
        resetKleurLijst();
        if (land == Landen.BELGIE){
           kleuren.set(1, 3);
           kleuren.set(3, 3);
           kleuren.set(7, 3);
        }
        if (land == Landen.DUITSLAND){
           kleuren.set(1, 3);
           kleuren.set(3, 3);
           kleuren.set(7, 3);
        }
        if (land == Landen.FRANKRIJK){
           kleuren.set(1, 3);
           kleuren.set(5, 3);
           kleuren.set(8, 3);
        }
        if (land == Landen.NEDERLAND){
           kleuren.set(1, 3);
           kleuren.set(5, 3);
           kleuren.set(8, 3);
        }
    }
    
    /**
     * @author Tim Gysen
     * zet alle elementen van de arraylist kleuren terug naar 0
     * voorkomt problemen bij wisselen van landen.
        
    
    */
    public void resetKleurLijst(){
        System.out.println("resetkleurlijst begonnen");
        kleuren.clear();
        for (int i=0; i<10; i++){
            kleuren.add(0);
        }
    }
    private int getRandomX(){
        return r.nextInt(breedte);
    }
    private int getRandomY(){
        return r.nextInt(hoogte);
    }
    /**
     * geïnspireerd door doolhof code op toledo
     * zorgt ervoor dat er gestart wordt met de juiste hoeveelheid van elke kleur.
     * @param l het land waarvan de vlag gemaakt moet worden
     */
    public void verspreidKleuren(Landen l){
        System.out.println("verspreidkleuren begonnen ");
        landKiezen(l);
        for(int i = 1; i < 9; i++){
            
            
            intNaarKleur(i);
            
            int j = (int) kleuren.get(i);
            
            for(int k = j; k > 0;){
                
                int x = getRandomX();
                int y = getRandomY();
                
                if(getVakjeOp(x,y).getKleur() == Kleur.LEEG){
                    getVakjeOp(x,y).setKleur(invulKleur);
                    k--;
                }
            }
          
        }
        System.out.println("verspreidkleuren gebeurd");
        
        
    }
    /**
     * zet de kleur waarmee gevuld wordt om van index in de lijst naar kleur
     * @param i de index in arraylist kleuren
     */
    public void intNaarKleur(int i){
        if (i == 1){
            invulKleur = Kleur.ROOD;
        }
        else if (i == 2){
            invulKleur = Kleur.ORANJE;
        }
        else if (i == 3){
            invulKleur = Kleur.GEEL;
        }
        else if (i == 4){
            invulKleur = Kleur.GROEN;
        }
        else if (i == 5){
            invulKleur = Kleur.BLAUW;
        }
        else if (i == 6){
            invulKleur = Kleur.PAARS;
        }
        else if (i == 7){
            invulKleur = Kleur.ZWART;
        }
        else if (i == 8){
            invulKleur = Kleur.WIT;
        }
        
    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }

    public Landen getLand() {
        return land;
    }

    public ArrayList getKleuren() {
        return kleuren;
    }

    public int getKleurNR() {
        return kleurNR;
    }

    public Kleur getInvulKleur() {
        return invulKleur;
    }
    
}
