package SchuifSpel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SpelbordController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ankerpaneel;

    @FXML
    private Button resetknop;
    
    private Spelbord model;
    private SpelbordView view;
    
    public void setModel(Spelbord model){
        System.out.println("setmodel begonnen");
//        this.model = model;
//        
//        view = new SpelbordView(model);
//        ankerpaneel.getChildren().add(view);
    }
    
    @FXML
    void initialize() {
        

    }
}
