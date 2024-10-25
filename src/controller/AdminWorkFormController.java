package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminWorkFormController {
    public Label lblRooms;
    public Label lblMeal;
    public Label lblIncome;
    public ImageView imgLeftArw;
    public AnchorPane workAdminContext;
    public Label lblIncomeReport;
    public ImageView imgHotelName;

    public void lblRoomsMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)workAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateNewRoomForm.fxml"))));
    }

    public void lblIncomeMouseClick(MouseEvent mouseEvent) {
    }

    public void imgLeftArwMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgLeftArw.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"))));
    }

    public void lblMealMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)workAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPackageForm.fxml"))));
    }

    public void lblIncomeReportMouseClick(MouseEvent mouseEvent) {
    }
}
