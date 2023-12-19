package javafx.controllers.student;

import javafx.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.database.Connector;
import javafx.entity.Classes;
import javafx.entity.Student;
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

public class EditController implements Initializable {
    public TextField ipFullName;
    public TextField ipEmail;
    public TextField ipTel;
    public TextArea ipAddress;
    public DatePicker ipDob;
    public ComboBox<Classes> ipClass;

    public static Student editStudent;

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

            // set edit data to form
            ipFullName.setText(editStudent.getFullName());
            ipEmail.setText(editStudent.getEmail());
            ipTel.setText(editStudent.getTelephone());
            ipAddress.setText(editStudent.getAddress());
            ipDob.setValue(editStudent.getDob());
//            ipClass.setValue();

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
            Classes cl = ipClass.getSelectionModel().getSelectedItem();

            String sql = "insert into students(fullname,email,telephone,address,dob,class_id)" +
                    " values('"+fullName+"','"+email+"','"+tel+"','"+address+"','"+dob.toString()+"',"+cl.getId()+")";

            Connector connect = new Connector();
            connect.getConn().createStatement().execute(sql);
            backToList(null);
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
