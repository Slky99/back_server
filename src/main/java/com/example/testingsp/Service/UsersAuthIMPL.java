package com.example.testingsp.Service;

import com.example.testingsp.Repository.UsersAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersAuthIMPL implements  UserAuthService{


    @Autowired
    private UsersAuthRepo usersAuthRepo;

    @Override
    public int loginValidation(String email, String password) {
        boolean userExists = usersAuthRepo.existsByEmailAndPassword(email, password);
        return userExists ? 1 : 0;
    }

}
