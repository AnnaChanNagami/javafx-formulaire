package afpa.fr;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClosedButton extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crée un nouveau bouton
        Button btn = new Button();
        btn.setText("Quitter");

        // Ajoute une action lorsque le bouton est cliqué
        // btn est une variable qui référence à l'instance de classe Button
        // setOnAction est une méthode qui est appelée sur btn
        // event c'est l'évènement généré sur l'action utilisateur
        // le flèche est la syntaxe d'une fonction lambda aussi appelée fonction fléchée
        // =
        // déclaration de fctn classic de type event et qui déclenche les instructions
        // après la flèche
        // Platform.exit nous fait quitter la fenêtre 
        btn.setOnAction(event -> Platform.exit());

        // Utilise un StackPane comme conteneur de la scène
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Crée une nouvelle scène avec le StackPane
        Scene scene = new Scene(root, 300, 250);

        // Configure la scène principale
        primaryStage.setTitle("Bonjour les amis !");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
