package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeFormController {

    public JFXButton btnDashboard;
    public JFXButton btnManageUsers;
    public JFXButton btnAddNewPayment;
    public JFXButton btnReports;
    public AnchorPane contextOfHomeForm;

    public void initialize(){

    }

    public void btnReports_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/ReportsForm.fxml";
        navigate(url, "Reports");
    }

    public void btnAddNewPayment_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/AddNewPaymentForm.fxml";
        navigate(url, "Add New Payment");
    }

    public void btnManageUsers_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/ManageUserForm.fxml";
        navigate(url, "Manage User");
    }

    public void btnDashboard_OnAction(ActionEvent actionEvent) throws IOException {
        String url = "../views/DashboardForm.fxml";
        navigate(url, "DashBoard");
    }

    public void btnManageUser_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/ManageUserForm.fxml";
            navigate(url, "Manage Users");
        }
    }

    public void btnAddNewPayment_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/AddNewPaymentForm.fxml";
            navigate(url, "Add New Payment");
        }
    }

    public void btnReports_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/ReportsForm.fxml";
            navigate(url, "Reports");
        }
    }

    public void btnDashboard_OnKeyPress(KeyEvent keyEvent) throws IOException {
        if ((keyEvent.getCode() == KeyCode.getKeyCode("Enter")) || (keyEvent.getCode() == KeyCode.getKeyCode("Space"))) {
            String url = "../views/DashboardForm.fxml";
            navigate(url, "Dashboard");
        }
    }

    private void navigate(String url, String title)   {
        MainFormController ctrl = (MainFormController) btnDashboard.getScene().getUserData();
        ctrl.navigate(url,title,true);
    }
}
