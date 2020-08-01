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
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VakjeView extends Region {
    private Vakje vakjeModel;
    
    public VakjeView(Vakje vakjeModel, int x, int y) {
        this.vakjeModel = vakjeModel;

        getChildren().add(maakRechthoekVoorPositieEnVakje(x, y, vakjeModel));
    }
    protected Color getColorVakje(Vakje vakje) {
        if (vakje.getKleur() == Kleur.ROOD) {
            return Color.RED;
        }
        else if (vakje.getKleur() == Kleur.ORANJE) {
            return Color.ORANGE;
        }
        else if (vakje.getKleur() == Kleur.GEEL) {
            return Color.YELLOW;
        }
        else if (vakje.getKleur() == Kleur.GROEN) {
            return Color.GREEN;
        }
        else if (vakje.getKleur() == Kleur.BLAUW) {
            return Color.BLUE;
        }
        else if (vakje.getKleur() == Kleur.PAARS) {
            return Color.PURPLE;
        }
        else if (vakje.getKleur() == Kleur.ZWART) {
            return Color.BLACK;
        }
        else{
            return Color.WHITE;
        }
    }
    private Rectangle maakRechthoekVoorPositieEnVakje(int x, int y, Vakje vakje) {
        int size = SpelbordView.SIZE;
        Rectangle rechthoek = new Rectangle(x * size+1, y * size+1, size-2, size-2);
        rechthoek.setFill(getColorVakje(vakje));
        
        return rechthoek;
        
    }
}
