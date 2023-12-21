package javafx.controllers.student;

import javafx.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.database.Connector;
import javafx.entity.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ListController  implements Initializable {
    public TableView<Student> tbView;
    public TableColumn<Student,String> tcName;
    public TableColumn<Student,String> tcEmail;
    public TableColumn<Student,String> tcTel;
    public TableColumn<Student,String> tcAddress;
    public TableColumn<Student, LocalDate> tcDob;
    public TableColumn<Student, Button> tcEdit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcName.setCellValueFactory(new PropertyValueFactory<Student,String>("fullName"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
        tcTel.setCellValueFactory(new PropertyValueFactory<Student,String>("telephone"));
        tcAddress.setCellValueFactory(new PropertyValueFactory<Student,String>("address"));
        tcDob.setCellValueFactory(new PropertyValueFactory<Student,LocalDate>("dob"));
        tcEdit.setCellValueFactory(new PropertyValueFactory<Student,Button>("btnEdit"));

        ObservableList<Student> ls = FXCollections.observableArrayList();
//        ls.add(new Student("Tuan Anh","tuananh@gmail.com","0987654321","100 Lang Ha",
//                        LocalDate.parse("2004-12-12")));

        String sql = "select * from students";
        Connector connect = Connector.getInstance();
        try {
            ResultSet rs = connect.getConn().createStatement().executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("fullname");
                String email = rs.getString("email");
                String tel = rs.getString("telephone");
                String address = rs.getString("address");
                LocalDate dob = LocalDate.parse(rs.getString("dob"));
                ls.add(new Student(id,name,email,tel,address,dob));
            }
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();
        }finally {
            tbView.setItems(ls);
        }
    }

    public void goToCreate(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/student/create.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
