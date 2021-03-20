package lk.ijse.pos.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane dashBoardUiContainer;


    public void navigateToCustomerForm(MouseEvent mouseEvent) throws IOException {
        Stage stage= (Stage) dashBoardUiContainer.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass()
                .getResource("../view/CustomerForm.fxml"))));
        stage.centerOnScreen();
    }


}
