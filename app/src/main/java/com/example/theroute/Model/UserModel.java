package com.example.theroute.Model;

public class UserModel {
    String username;
    String password;
    String email;

    String gender;

    public UserModel(String username, String password, String email,String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }
    public UserModel(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
