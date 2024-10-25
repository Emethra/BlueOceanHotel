package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddRoom;

import java.io.IOException;
import java.util.ArrayList;

public class UpdateNewRoomFormController {
    public TableView<Object> tblViewAddRoom;
    public JFXTextField txtRoomNo;
    public JFXTextField txtTypeOfRoom;
    public JFXTextField txtNoOfBed;
    public JFXTextField txtTypeOfBed;
    public TableColumn colRoomNo;
    public TableColumn colTypeOfRoom;
    public TableColumn colNoOfBed;
    public TableColumn colTypeOfBed;
    public JFXButton btnAdd;
    public ImageView imgBackArw;
    public AnchorPane addNewRoomContext;
    public TableColumn colOther;
    public JFXTextField txtOther;
    public JFXButton btnDelete;

    static ArrayList<AddRoom> addRoomList=new ArrayList<>();



    public void initialize() {
        loadAddRoom();
        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colTypeOfRoom.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colNoOfBed.setCellValueFactory(new PropertyValueFactory<>("noOfBeds"));
        colTypeOfBed.setCellValueFactory(new PropertyValueFactory<>("typeofBed"));
        colOther.setCellValueFactory(new PropertyValueFactory<>("otherItem"));
    }

    private void loadAddRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (AddRoom temp : addRoomList) {
            //tmObservableList.add(new AddRoom(temp.getRoomNo(),temp.getRoomType(),temp.getNoOfBeds(),temp.getTypeofBed(),temp.getOtherItem()));
        }
        tblViewAddRoom.setItems(tmObservableList);
    }

    public void btnAddOnAction(ActionEvent actionEvent) throws IOException {
            AddRoom addRoom = new AddRoom(txtRoomNo.getText(),txtTypeOfRoom.getText(),txtNoOfBed.getText(),txtTypeOfBed.getText());
            if (addRoomList.add(addRoom)) {
                new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.APPLY).show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.APPLY).show();
            }
            Stage window = (Stage) addNewRoomContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewRoomForm.fxml"))));
        }

    public void imgBackArwMouseClick(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage)imgBackArw.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }
}
