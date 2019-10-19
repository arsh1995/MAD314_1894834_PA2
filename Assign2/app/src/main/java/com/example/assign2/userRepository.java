package com.example.assign2;

import java.util.ArrayList;
import java.util.List;

public class userRepository {
    private static userRepository instance = null;
    private List<user> a = new ArrayList<>();

    private userRepository() {
        user a = new user();


        a.name = "Arsh";
        a.Id = 123;
        a.password = "abc";

        this.a.add(a);
    }


    public static userRepository getInstance() {
        if (instance == null) {
            instance = new userRepository();
        }
        return instance;
    }

    public void adduser(user a) {
        this.a.add(a);
    }

    public List<user> geta() {
        return this.a;
    }
}


