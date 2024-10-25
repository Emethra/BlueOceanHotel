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

public class AdminFormController {
    public ImageView imgArw;
    public JFXTextField txtUserEmail;
    public JFXTextField txtPsw;
    public JFXButton btnLog;
    public AnchorPane logAdminContext;

    public void imgArwMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage) logAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"))));
    }

    public void txtUserEmailOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserEmail.getText().equals("blueoceanhotel@gmail.com") & txtPsw.getText().equals("ABCD1234")) {
            Stage window = (Stage) logAdminContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
        }
    }

    public void btnLogOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)logAdminContext.getScene().getWindow();
       window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
   }
}


