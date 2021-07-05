package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public JFXButton btnDashboard;
    public JFXButton btnManageUsers;
    public JFXButton btnAddNewPayment;
    public JFXButton btnReports;
    public AnchorPane contextOfMainForm;
    public ImageView imgNav;
    public ImageView imgMinimize;
    public ImageView imgClose;
    public Label lblTitle;

    public void initialize() {

    }

    public void btnReports_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/ReportsForm.fxml";
        navigate(url);
    }

    public void btnAddNewPayment_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/AddNewPaymentForm.fxml";
        navigate(url);
    }

    public void btnManageUsers_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/ManageUserForm.fxml";
        navigate(url);
    }

    public void btnDashboard_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/DashboardForm.fxml";
        navigate(url);
    }

    public void btnManageUser_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/ManageUserForm.fxml";
            navigate(url);
        }
    }

    public void btnAddNewPayment_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/AddNewPaymentForm.fxml";
            navigate(url);
        }
    }

    public void btnReports_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/ReportsForm.fxml";
            navigate(url);
        }
    }

    public void btnDashboard_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/DashboardForm.fxml";
            navigate(url);
        }
    }

    public void navigate(String url) throws IOException {
        Stage stage = (Stage) contextOfMainForm.getScene().getWindow();
        Parent root = FXMLLoader.load(this.getClass().getResource(url));
        Scene dashboard = new Scene(root);
        stage.setScene(dashboard);
        stage.setTitle("DashBoard");
        stage.setResizable(false);
        stage.show();
    }
}