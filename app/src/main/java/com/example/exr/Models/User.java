package com.example.exr.Models;

public class User {
    private String Email, Login, Phone, Password;
    public User() {}

    public User(String Email, String Login, String  Phone, String Password)
    {
        this.Email = Email;
        this.Login = Login;
        this.Phone = Phone;
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
