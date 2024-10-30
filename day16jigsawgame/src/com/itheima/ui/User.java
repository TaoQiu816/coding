package com.itheima.ui;

public class User {
    private String usrerName;
    private String password;

    public User() {
    }

    public User(String usrerName, String password) {
        this.usrerName = usrerName;
        this.password = password;
    }

    public String getUsrerName() {
        return usrerName;
    }

    public void setUsrerName(String usrerName) {
        this.usrerName = usrerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
