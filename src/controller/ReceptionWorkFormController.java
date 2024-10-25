package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionWorkFormController {
    public Label lblReserve;
    public Label lblMaintenace;
    public ImageView imgBack;
    public AnchorPane WorkReceptionContext;
    public ImageView WorkReception;

    public void imgBackOnAction(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"))));
    }

    public void lblReserveMouseClick(MouseEvent mouseEvent) throws IOException {
       System.out.println("Access");
        Stage window = (Stage)WorkReceptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));

    }

    public void lblMaintenaceMouseClick(MouseEvent mouseEvent) {
    }

    public void btnReserveMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)WorkReceptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));
    }
}
