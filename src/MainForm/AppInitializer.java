package MainForm;

import controller.MainFormController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../views/MainForm.fxml"));
        Parent root = fxmlLoader.load();
        MainFormController ctrl = fxmlLoader.getController();

        Scene scene = new Scene(root);
        ctrl.navigate("/views/HomeForm.fxml","IJSE Student Management System",false);
        scene.setUserData(ctrl);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);

        primaryStage.setResizable(false);
        primaryStage.show();
        System.out.println(Screen.getPrimary().getVisualBounds());
    }
}
