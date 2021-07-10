package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;

public class MainFormController {
    public JFXButton btnDashboard;
    public JFXButton btnManageUsers;
    public JFXButton btnAddNewPayment;
    public JFXButton btnReports;
    public AnchorPane contextOfMainForm;
    public ImageView imgClose;
    public Label lblTitle;
    public ImageView imgLogOut;
    public ImageView imgNotifications;
    public ImageView imgMenu;
    public ImageView img_Minimize;
    public ImageView imgMinimize;
    public AnchorPane pneAppBar;
    private double xpos;
    private double ypos;

    public void initialize() {
        lblTitle.setText("IJSE Student Management System.");
        pneAppBar.setOnMousePressed(event -> {
            xpos=event.getX();
            ypos=event.getY();
        });

        pneAppBar.setOnMouseDragged(event -> {
            Window mainWindow = imgClose.getScene().getWindow();
            mainWindow.setX(event.getScreenX()-xpos);
            mainWindow.setY(event.getScreenY()-ypos);
        });

        imgClose.setOnMouseEntered(event -> imgClose.setImage(new Image("views/asserts/icons/hovers/close_hover.png")));
        imgClose.setOnMouseExited(event -> imgClose.setImage(new Image("views/asserts/icons/close.png")));

        img_Minimize.setOnMouseEntered(event -> img_Minimize.setImage(new Image("views/asserts/icons/hovers/minimize_hover.png")));
        img_Minimize.setOnMouseExited(event -> img_Minimize.setImage(new Image("views/asserts/icons/minimize.png")));

        imgLogOut.setOnMouseEntered(event -> imgLogOut.setImage(new Image("views/asserts/icons/hovers/log-out_hover.png")));
        imgLogOut.setOnMouseExited(event -> imgLogOut.setImage(new Image("views/asserts/icons/log-out.png")));

        imgNotifications.setOnMouseEntered(event -> imgNotifications.setImage(new Image("views/asserts/icons/hovers/Trailing.png")));
        imgNotifications.setOnMouseExited(event -> imgNotifications.setImage(new Image("views/asserts/icons/Trailing.png")));

        imgClose.setOnMouseReleased(event -> ((Stage) (imgClose.getScene().getWindow())).close());
        img_Minimize.setOnMouseReleased(event -> ((Stage) (img_Minimize.getScene().getWindow())).setIconified(true));

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

    public void navigate(String url, String title) throws IOException {
        Stage stage = (Stage) contextOfMainForm.getScene().getWindow();
        Parent root = FXMLLoader.load(this.getClass().getResource(url));
        Scene dashboard = new Scene(root);
        stage.setScene(dashboard);
        lblTitle.setText(title);
        stage.setResizable(false);
        stage.show();
    }
}