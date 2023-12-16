package javafx.entity;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String fullName;
    private String email;
    private String telephone;
    private String address;
    private LocalDate dob;

    public Student(Integer id, String fullName, String email, String telephone, String address, LocalDate dob) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.dob = dob;
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

    public String toString(){
        return fullName+"\n"+email+"\n"+telephone+"\n"+address
                +"\n"+dob;
    }
}
