package com.example.testingsp.Controller;


import com.example.testingsp.Service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsersAuthCont {

    @Autowired
    private UserAuthService userAuthService ;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login/{email}/{password}")
    public ResponseEntity<Integer> login(@PathVariable("email") String email,
                                         @PathVariable("password") String password) {
        int loginResult = userAuthService.loginValidation(email, password);

        if (loginResult == 1)
        {   return new ResponseEntity<>(1, HttpStatus.OK);   }
        else
        {   return new ResponseEntity<>(0, HttpStatus.UNAUTHORIZED);  }
    }



}


