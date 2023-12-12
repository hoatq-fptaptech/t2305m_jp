package javafx.controllers;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController {
    public void goToStudent(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass()
                .getResource("../fxml/student/list.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
//        Stage s = new Stage();
//        s.setScene(new Scene(root,600,400));
//        s.show();
    }
}
