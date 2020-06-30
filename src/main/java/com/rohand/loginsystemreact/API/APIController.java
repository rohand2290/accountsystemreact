package com.rohand.loginsystemreact.API;

import java.util.ArrayList;
import java.util.UUID;

import com.rohand.loginsystemreact.API.Forms.LoginForm;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private ArrayList<UserInfo> userList = new ArrayList<>();
    @GetMapping("/api/test")
    public String returnHi() {
        return "hello";
    }


    @PostMapping("/api/register")
    public HttpStatus addLogin(@RequestBody LoginForm loginform) {
        userList.add(new UserInfo(loginform.getUsername(), loginform.getPassword(), UUID.randomUUID()));
        return HttpStatus.OK;
    }


    @GetMapping("/api/getAllUserInfo")
    public ArrayList<UserInfo> returnAllUserInfo() {
        return userList;

    }


    @PostMapping("/api/login")
    public UserInfo getUserInfo(@RequestBody LoginForm loginform) {
        return userList.stream()
            .filter(login -> login.getUsername().equals(loginform.getUsername()) && login.getPassword().equals(loginform.getPassword()))
            .findAny()
            .orElse(null);
    }

}