package javafx.factory;

import javafx.dao.ClassDAO;
import javafx.dao.DAOInterface;
import javafx.dao.StudentDAO;
import javafx.enums.DAOType;

public class DAOFactory {
    public final static DAOInterface getDAOInstance(DAOType daoType){
        switch (daoType){
            case STUDENT: return new StudentDAO();
            case CLASS: return new ClassDAO();
        }
        return null;
    }
}
