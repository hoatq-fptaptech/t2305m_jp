package java2.demo5;

import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args){
        String password = "123456";
        String salt = BCrypt.gensalt(10);
        String hashed = BCrypt.hashpw(password,salt); // lưu vào db giá trị này cho password
        System.out.println(hashed);

        // login - compare password
        String inputPwd = "123456";
        boolean check = BCrypt.checkpw(inputPwd,hashed);
        if(check){
            System.out.println("Login successfully");
        }else{
            System.out.println("Email or Password is not correct");
        }
    }
}
