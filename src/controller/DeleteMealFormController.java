package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMealFormController {
    public ImageView imgBack;
    public JFXComboBox cmbPackage;
    public JFXButton btnDelete;

    public void imgBackMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPackageForm.fxml"))));
    }

    public void btnDelete(ActionEvent actionEvent) {
    }
}
