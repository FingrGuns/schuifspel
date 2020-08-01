
package SchuifSpel;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * @author Tim Gysen
 */
public class SpelbordView extends Region {
    public static int SIZE = 40;
    private Spelbord model;
    
    public SpelbordView(Spelbord SpelbordModel) {
        model = SpelbordModel;
        update();
    }

    
    public void update() {
        getChildren().clear();
        int breedte = model.getBreedte();
        int hoogte = model.getHoogte();

        Rectangle rechthoek = new Rectangle(0, 0, breedte* SIZE, hoogte* SIZE);
        rechthoek.setFill(Color.gray(0.9));
        getChildren().addAll(rechthoek);

        for (int i=0; i<breedte; i++) {
            for (int j=0; j<hoogte; j++) {
                Node vakjeView = getVakjeViewOp(i, j);
                getChildren().add(vakjeView);
            }
        }
    }
     private Node getVakjeViewOp(int x, int y) {
        Vakje vakje = model.getVakjeOp(x, y);
        
        return new VakjeView(vakje, x, y);
    }
}
