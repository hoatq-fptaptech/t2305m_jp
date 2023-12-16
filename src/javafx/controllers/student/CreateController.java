package javafx.controllers.student;

import javafx.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.database.Connector;
import javafx.entity.Classes;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CreateController implements Initializable {
    public TextField ipFullName;
    public TextField ipEmail;
    public TextField ipTel;
    public TextArea ipAddress;
    public DatePicker ipDob;
    public ComboBox<Classes> ipClass;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Classes> ls = FXCollections.observableArrayList();
        String sql = "select * from classes";
        try{
            Connector connect = new Connector();
            ResultSet rs = connect.getConn().createStatement().executeQuery(sql);
            while (rs.next()){
                ls.add(new Classes(rs.getInt("id"),rs.getString("name"),rs.getString("room")));
            }
        }catch (Exception e){
            showAlert(e.getMessage());
        }finally {
            ipClass.setItems(ls);
        }

    }

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/student/list.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void submit(ActionEvent actionEvent) {
        try{
            String fullName = ipFullName.getText();
            String email = ipEmail.getText();
            String tel = ipTel.getText();
            String address = ipAddress.getText();
            LocalDate dob = ipDob.getValue();

//            String sql = "insert into students(fullname,email,telephone,address,dob"

        }catch (Exception e){
            showAlert(e.getMessage());
        }
    }

    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(message);
        alert.show();
    }
}
