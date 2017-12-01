package control;


import java.io.IOException;

import application.OneController;

/**
 * 
 * A <b>JavaFX</b>
 * @author miguel
 * @version 1.0
 * @see controlFX
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFX extends Application {
	 private Stage stagePrincipal;
	    private AnchorPane rootPane;
	    
	    @Override
  public void start(Stage stage) throws Exception {
	 Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
	  
	 Scene scene = new Scene(root);
	  
	 stage.setScene(scene);
	  stage.show();
	  }
	 
	 
	    
	 
	    /*
	     * cargamos la ventana principal
	     */
	    public void mostrarVentanaPrincipal() {
	        try {
	            FXMLLoader loader = new FXMLLoader(MainFX.class.getResource("Login.fxml"));
	            rootPane=(AnchorPane) loader.load();
	            Scene scene = new Scene(rootPane);
	stagePrincipal.setTitle("Ventana Principal");
	            stagePrincipal.setScene(scene);
	            Control controller = loader.getController();
	            controller.set(this);
	            stagePrincipal.show();
	        } catch (IOException e) {
	            //tratar la excepción.
	        }
	   }
	 
	   
	    
	
	public static void main(String[] args) {
    launch(args);
	}

 
}
