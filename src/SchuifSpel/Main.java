package SchuifSpel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    

    @Override
    public void start(Stage stage) throws Exception{
        System.out.println("gestart");
        // Model
        Spelbord model = new Spelbord(3,3,Landen.BELGIE);
        
        System.out.println("model geladen");
        
        // FXML View
        FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLView.fxml"));
        Parent root = lader.load();
        
        // Controller
        SpelbordController controller = lader.getController();
        System.out.println("controller geladen");
        
        
        //MVC aan elkaar linken
        controller.setModel(model);
        System.out.println("MVC gelinkt");
        
        
        // hoofdvenster
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Prefab FXML applicatie");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
