package javafx.dao;

import javafx.entity.Student;

import java.util.ArrayList;

public interface DAOInterface {
    ArrayList<Student> list();
    boolean create(Student s);
    boolean update(Student s);
    boolean delete(int id);
    Student findOne(int id);
}
