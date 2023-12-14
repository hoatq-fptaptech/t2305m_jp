package javafx.controllers.student;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.entity.Student;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ListController  implements Initializable {
    public TableView<Student> tbView;
    public TableColumn<Student,String> tcName;
    public TableColumn<Student,String> tcEmail;
    public TableColumn<Student,String> tcTel;
    public TableColumn<Student,String> tcAddress;
    public TableColumn<Student, LocalDate> tcDob;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcName.setCellValueFactory(new PropertyValueFactory<Student,String>("fullName"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
        tcTel.setCellValueFactory(new PropertyValueFactory<Student,String>("telephone"));
        tcAddress.setCellValueFactory(new PropertyValueFactory<Student,String>("address"));
        tcDob.setCellValueFactory(new PropertyValueFactory<Student,LocalDate>("dob"));

        ObservableList<Student> ls = FXCollections.observableArrayList();
//        ls.add(new Student("Tuan Anh","tuananh@gmail.com","0987654321","100 Lang Ha",
//                        LocalDate.parse("2004-12-12")));

        //        String sql = "select * from students";
//        Connector connect = new Connector();
//        try {
//            ResultSet rs = connect.getConn().createStatement().executeQuery(sql);
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("fullname");
//                System.out.println(id+"-"+name);
//            }
//        }catch (Exception e){
//
//        }

        tbView.setItems(ls);
    }
}
