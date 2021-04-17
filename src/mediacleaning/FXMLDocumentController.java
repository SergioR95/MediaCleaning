package mediacleaning;

import java.io.IOException;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import mediacleaning.controller.Facade;

public class FXMLDocumentController {

    private Facade facade;
    private String address;
    
    @FXML
    private ImageView background;

    @FXML
    private Button button;

    @FXML
    private Label labelSelector;

    @FXML
    private Button selector;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        facade.writeNewFile();
        System.exit(0);
    }

    
    
    @FXML
    void handleselectorAction(ActionEvent event) throws IOException {
        this.facade = new Facade();
        this.address = this.facade.getAddress();
        this.facade.setListID(this.address);
        labelSelector.setText(this.address);
    }

}