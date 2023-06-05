package com.example.login.Service;

import com.example.login.model.LogIn;
import com.example.login.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users= new ArrayList<>();
        users.add(new User("john","123456","John","john@codegym.vn",10));
        users.add(new User("bill","123456","Bill","bill@codegym.vn",15));
        users.add(new User("mike","123456","Mike","mike@codegym.vn",16));

    }

    public static User checkLogIn(LogIn logIn){
        for(User u: users){
            if(u.getAccount().equals(logIn.getAccount()) && u.getPassword().equals(logIn.getPassword())){
                return u;
            }
        }
        return null;
    }
}
