package javafx.entity;

import javafx.Main;
import javafx.controllers.student.EditController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String fullName;
    private String email;
    private String telephone;
    private String address;
    private LocalDate dob;

    private Integer class_id;

    private Button btnEdit;

    public Student(Integer id, String fullName, String email, String telephone, String address, LocalDate dob,Integer class_id) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.dob = dob;
        this.class_id = class_id;

        this.btnEdit = new Button("Edit");
        this.btnEdit.setStyle("-fx-background-color: red");

        this.btnEdit.setOnAction(event->{
            try{
                EditController.editStudent = this;
                Parent root = FXMLLoader.load(getClass().getResource("../fxml/student/edit.fxml"));
                Main.rootStage.setScene(new Scene(root,800,600));
            }catch (Exception e){

            }
        });
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(Button btnEdit) {
        this.btnEdit = btnEdit;
    }

    public String toString(){
        return fullName+"\n"+email+"\n"+telephone+"\n"+address
                +"\n"+dob;
    }
}
