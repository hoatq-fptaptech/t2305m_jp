package lab.lab10;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;

    private ArrayList<String> phones;

    public PhoneNumber(String name,String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phones;
    }

}
