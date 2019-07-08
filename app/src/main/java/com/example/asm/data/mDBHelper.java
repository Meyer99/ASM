package com.example.asm.data;

import com.example.asm.data.model.User;

import org.litepal.LitePal;

import java.util.List;

public class mDBHelper implements DBHelper {

    public void mDBHelper(){

    }

    @Override
    public User login(Integer id, String password){

        if (password.isEmpty()) {
            return null;
        }

        List<User> user = LitePal.where("id = ?", id.toString()).find(User.class);

        if (user.size() != 1) {
            return null;
        } else {
            if (password == user.get(0).getPassword()) {
                return user.get(0);
            } else {
                return null;
            }
        }

    }

}
