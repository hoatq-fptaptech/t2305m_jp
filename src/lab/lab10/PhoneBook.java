package lab.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber pn: phoneList){ // foreach  pn <=> phoneList[i]
            //phoneList.indexOf(pn);// index
            if(pn.getName().equals(name)){
                if(pn.getPhone().contains(phone)){
                    return;
                }
                pn.getPhone().add(phone);
                return;
            }
        }
        PhoneNumber p = new PhoneNumber(name,phone);
        phoneList.add(p);
        return;
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber pn: phoneList){ // foreach  pn <=> phoneList[i]
            //phoneList.indexOf(pn);// index
            if(pn.getName().equals(name)){
               phoneList.remove(pn);
               return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newphone) {
        for(PhoneNumber pn: phoneList) {
            if (pn.getName().equals(name)) {
//                if(pn.getPhone().contains(oldPhone)){
//                    int index = pn.getPhone().indexOf(oldPhone);
//                    pn.getPhone().set(index,newphone);
//                }
                pn.getPhone().remove(oldPhone);
                pn.getPhone().add(newphone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber pn: phoneList) {
            if (pn.getName().equals(name)) {
                return pn;
            }
        }
        return null;
    }

    @Override
    public void sort() {
//        int n = phoneList.size();
//        for(int i=0;i<n-1;i++){ // bubble sort
//            for(int j=0;j<n-i-1;j++){ // max: j = n-1 -> phoneList.get(n-1+1)
//                if(phoneList.get(j).getName().compareTo(phoneList.get(j+1).getName()) > 0){
//                    PhoneNumber tmp = phoneList.get(j);
//                    phoneList.set(j,phoneList.get(j+1));
//                    phoneList.set(j+1,tmp);
//                }
//            }
//        }
        Comparator<PhoneNumber> comp = new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(phoneList,comp);

    }
}
