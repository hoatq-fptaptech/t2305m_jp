package javafx.dao;

import javafx.database.Connector;
import javafx.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentDAO implements DAOInterface<Student>{
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
                        LocalDate.parse(rs.getString("dob")),
                        rs.getInt("class_id")
                ));
            }
        }catch (Exception e){
        }
        return ls;
    }

    @Override
    public boolean create(Student s) {
        try{
            String sql = "insert into students(fullname,email,telephone,address,dob,class_id) values(?,?,?,?,?,?)";
            Connector conn = Connector.getInstance();
            PreparedStatement pstm = conn.getConn().prepareStatement(sql);
            pstm.setString(1,s.getFullName());
            pstm.setString(2,s.getEmail());
            pstm.setString(3,s.getTelephone());
            pstm.setString(4,s.getAddress());
            pstm.setString(5,s.getDob().toString());
            pstm.setString(5,s.getDob().toString());
            pstm.execute();
        }catch (Exception e){
            return false;
        }
        return true;
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
