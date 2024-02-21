package com.GLFS.controller;

import com.GLFS.domain.ResponseResult;
import com.GLFS.domain.User;
import com.GLFS.service.LoginServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginServcie loginServcie;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginServcie.login(user);
    }

    @PostMapping ("/user/logout")
    public ResponseResult logout(){
        return loginServcie.logout();
    }
}
