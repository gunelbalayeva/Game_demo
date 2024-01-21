package com.example.Concrete;

import com.example.Abstract.UserCheckService;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean checkUser() {
        return true;
    }
}
