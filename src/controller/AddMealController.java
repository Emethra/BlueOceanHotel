package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMealController {

    public ImageView imgBack;
    public JFXTextField txtPackCode;
    public JFXTextField txtPackName;
    public JFXTextField txtPackItem;
    public JFXButton btnAdd;

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void imgBackMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPackageForm.fxml"))));
    }
}
