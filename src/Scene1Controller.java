import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Scene1Controller implements Initializable {

    @FXML
    private Label Showchoose,Showwarnadd;

    @FXML
    private ChoiceBox<String> Choicebuah;

    @FXML
    private TextField NewChoice;

    @FXML
    private void SHOWGO(ActionEvent event) {
        Showchoose.setText("Anda memesan buah : "+ Choicebuah.getValue().toString());
        
    }

    @FXML
    private void Addchoice(ActionEvent event) {
            Choicebuah.getItems().add(NewChoice.getText());
            Showwarnadd.setText("*Buah "+ NewChoice.getText() + " Telah berhasil di masukkan");
            NewChoice.clear();
    }




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Choicebuah.getItems().addAll("Jeruk","Semangka","Apel");
        System.out.println("mwehehehehe");
    }
}