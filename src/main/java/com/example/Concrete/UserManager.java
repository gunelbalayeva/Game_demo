package com.example.Concrete;

import com.example.Abstract.UserCheckService;
import com.example.Abstract.UserService;
import com.example.Entity.concretes.Gamer;

public class UserManager implements UserService {
    UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(Gamer gamer) {
        if (userCheckService.checkUser()) {
            System.out.println(gamer.getFirstName() + " your accaunt created..");
        } else {
            System.out.println("Invalid national id..");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " yor accaunt deleted");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " your accaunt updated..");
    }
}
