package javafx.dao;

import javafx.entity.Classes;

import java.util.ArrayList;

public class ClassDAO implements DAOInterface<Classes> {
    @Override
    public ArrayList<Classes> list() {
        return null;
    }

    @Override
    public boolean create(Classes classes) {
        return false;
    }

    @Override
    public boolean update(Classes classes) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Classes findOne(int id) {
        return null;
    }
}
