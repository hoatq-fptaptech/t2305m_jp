package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class StudentFormController {

    public TextField ipFullName;
    public TextField ipEmail;
    public TextField ipTel;
    public TextArea ipAddress;
    public Text txtFullName;
    public DatePicker ipDoB;
    public Text txtDoB;

    public void submit(ActionEvent actionEvent) {
        String fullName = ipFullName.getText();
        String email = ipEmail.getText();
        String tel = ipTel.getText();
        String address = ipAddress.getText();
        LocalDate dob = ipDoB.getValue();
        // set view
        txtFullName.setText(fullName);

        txtDoB.setText(dob.toString());
    }
}
