package afpa.fr;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormulaireApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulaire");

        // Crée les labels et champs de texte
        Label labelUserInput = new Label("Entrée utilisateur :");
        TextField textFieldUserInput = new TextField();
        textFieldUserInput.setPromptText("Saisissez un texte");

        Label labelCopyInput = new Label("Copie de l'entrée :");
        TextField textFieldCopyInput = new TextField();
        textFieldCopyInput.setPromptText("Saisissez un texte");

        // Crée les boutons
        Button buttonRecopier = new Button("Recopier");
        Button buttonEffacer = new Button("Effacer");
        Button buttonQuitter = new Button("Quitter");
        buttonRecopier.setPrefWidth(80);
        buttonEffacer.setPrefWidth(80);
        buttonQuitter.setPrefWidth(80);

        // Définir les actions des boutons
    // ButtonRecopier est un objet de la classe button
    // SetOnAction est la méthode appelée pour faire l'action
    // Fonction fléchée/lambda avec event 
    // copyInput récupère les données de UserInput (getter et setter) 
    // setText est une chaîne de caractère => String
    // textFieldUserInput.getText est le paramètre de setText et c'est une String


        buttonRecopier.setOnAction(event -> textFieldCopyInput.setText(textFieldUserInput.getText()));
        buttonEffacer.setOnAction(event -> {
            textFieldUserInput.clear();
            textFieldCopyInput.clear();
        });
        buttonQuitter.setOnAction(event -> Platform.exit());

        // Crée et configure le GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Ajoute les composants au GridPane
        gridPane.add(labelUserInput, 0, 0);
        gridPane.add(textFieldUserInput, 1, 0);
        gridPane.add(buttonRecopier, 2, 0);

        gridPane.add(labelCopyInput, 0, 1);
        gridPane.add(textFieldCopyInput, 1, 1);
        gridPane.add(buttonEffacer, 2, 1);

        gridPane.add(buttonQuitter, 2, 2);
        // Recentrage des boutons et de l'entrée utili
        gridPane.setAlignment(Pos.CENTER);
        // Crée la scène
        Scene scene = new Scene(gridPane, 400, 200);

        // Configure la scène principale
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Le code ne permet pas d'avoir les boutons centrés (gridpane pas égal à VBOX)
    // La vbox n'a que pour rôle de mettre "les enfants" en vertical
    // Le centrage du gridpane est lié
    public static void main(String[] args) {
        launch(args);
    }
}
