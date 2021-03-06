package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFormController {

    public AnchorPane contextOfMainForm;
    public ImageView imgClose;
    public Label lblTitle;
    public ImageView imgLogOut;
    public ImageView imgNotifications;
    public ImageView imgMenu;
    public ImageView img_Minimize;
    public ImageView imgMinimize;
    public AnchorPane pneAppBar;
    public AnchorPane pneStage;
    public ImageView imgBack;
    private double xPos;
    private double yPos;
    private final boolean btnBack_visibility = false;

    public void initialize() {
        initWindows();


    }

    public void navigate(String url, String title,Boolean btnBack_visibility) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource(url));
            pneStage.getChildren().clear();
            pneStage.getChildren().add(load);
            lblTitle.setText(title);
            imgBack.setVisible(btnBack_visibility);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initWindows() {
        imgBack.setVisible(false);
        lblTitle.setText("IJSE Student Management System");
        pneAppBar.setOnMousePressed(event -> {
            xPos = event.getX();
            yPos = event.getY();
        });

        pneAppBar.setOnMouseDragged(event -> {
            Window mainWindow = imgClose.getScene().getWindow();
            mainWindow.setX(event.getScreenX() - xPos);
            mainWindow.setY(event.getScreenY() - yPos);
        });

        imgClose.setOnMouseEntered(event -> imgClose.setImage(new Image("views/asserts/icons/hovers/close_hover.png")));
        imgClose.setOnMouseExited(event -> imgClose.setImage(new Image("views/asserts/icons/close.png")));

        img_Minimize.setOnMouseEntered(event -> img_Minimize.setImage(new Image("views/asserts/icons/hovers/minimize_hover.png")));
        img_Minimize.setOnMouseExited(event -> img_Minimize.setImage(new Image("views/asserts/icons/minimize.png")));

        imgLogOut.setOnMouseEntered(event -> imgLogOut.setImage(new Image("views/asserts/icons/hovers/log-out_hover.png")));
        imgLogOut.setOnMouseExited(event -> imgLogOut.setImage(new Image("views/asserts/icons/log-out.png")));

        imgNotifications.setOnMouseEntered(event -> imgNotifications.setImage(new Image("views/asserts/icons/hovers/Trailing.png")));
        imgNotifications.setOnMouseExited(event -> imgNotifications.setImage(new Image("views/asserts/icons/Trailing.png")));

        imgBack.setOnMouseEntered(event -> imgBack.setImage(new Image("views/asserts/icons/hovers/back_hover.png")));
        imgBack.setOnMouseExited(event -> imgBack.setImage(new Image("views/asserts/icons/back.png")));

        imgClose.setOnMouseReleased(event -> ((Stage) (imgClose.getScene().getWindow())).close());
        img_Minimize.setOnMouseReleased(event -> ((Stage) (img_Minimize.getScene().getWindow())).setIconified(true));

    }

    public void btnBackOnAction(MouseEvent mouseEvent) {
        navigate("/views/HomeForm.fxml", "IJSE Student Management System",false);
    }
}