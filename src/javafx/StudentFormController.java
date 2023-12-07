package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentFormController {

    public TextField ipFullName;
    public TextField ipEmail;
    public TextField ipTel;
    public TextArea ipAddress;
    public DatePicker ipDoB;
    public Text txtInfo;

    private ArrayList<Student> list = new ArrayList<>();

    public void submit(ActionEvent actionEvent) {
        String fullName = ipFullName.getText();
        String email = ipEmail.getText();
        String tel = ipTel.getText();
        String address = ipAddress.getText();
        LocalDate dob = ipDoB.getValue();
        // set view
        Student s = new Student(fullName,email,tel,address,dob);
        list.add(s);
        render();
        clearInput();
    }

    private void render(){ // print list student to information
        String txt = "";
        for (Student s: list){
            txt += s.toString();
            txt+= "\n--------------------\n";
        }
        txtInfo.setText(txt);
    }

    private void clearInput(){
        ipFullName.clear();
        ipEmail.clear();
        ipTel.clear();
        ipAddress.clear();
        ipDoB.setValue(null);
    }
}
