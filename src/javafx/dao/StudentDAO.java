package javafx.dao;

import javafx.database.Connector;
import javafx.entity.Student;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentDAO implements DAOInterface{
    @Override
    public ArrayList<Student> list() {
        String sql = "select * from students";
        ArrayList<Student> ls = new ArrayList<>();
        try {
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getConn().createStatement().executeQuery(sql);
            while (rs.next()){
                ls.add(new Student(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("telephone"),
                        rs.getString("address"),
                        LocalDate.parse(rs.getString("dob"))
                ));
            }
        }catch (Exception e){
        }
        return ls;
    }

    @Override
    public boolean create(Student s) {
        return false;
    }

    @Override
    public boolean update(Student s) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Student findOne(int id) {
        return null;
    }
}
