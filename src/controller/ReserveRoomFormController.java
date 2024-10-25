package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserveRoomFormController {

    public Label lblBookRoom;
    public Label lblViewBooking;
    public Label lblViewCustomer;
    public Label lblCancelResevertion;
    public ImageView imgArrowBack;

    public void lblBookRoomMouseClick(MouseEvent mouseEvent) {
    }

    public void lblViewBookingMouseClick(MouseEvent mouseEvent) {
    }

    public void lblViewCustomerMouseClick(MouseEvent mouseEvent) {
    }

    public void lblCancelResevertionMouseClick(MouseEvent mouseEvent) {
    }

    public void imgArrowBackMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage) imgArrowBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
    }
}
