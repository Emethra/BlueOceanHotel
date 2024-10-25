package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionFormController {
    public JFXButton btnLogin;
    public ImageView imgLeftArrow;
    public JFXTextField txtPassword;
    public JFXTextField txtUser;
    public AnchorPane logReceptionContext;



    public void imgLeftArrowMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)logReceptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"))));
    }

    public void txtUserOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUser.getText().equals("Admin")&txtPassword.getText().equals("1234")) {
            Stage window = (Stage) logReceptionContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
        }
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)logReceptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
    }

    public void txtPassowrdOnAction(ActionEvent actionEvent) {

    }
}
