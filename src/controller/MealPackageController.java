package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPackageController {
    public ImageView imgBack;
    public Label lblAddMeal;
    public Label lblModifyMeal;
    public Label lblDeleteMeal;
    public AnchorPane mealPackageContext;

    public void imgBackMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
    }

    public void lblAddMealMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)mealPackageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddMealForm.fxml"))));
    }

    public void lblModifyMealMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)mealPackageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyMealForm.fxml"))));
    }

    public void lblDeleteMealMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)mealPackageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DeleteMealForm.fxml"))));

    }
}
