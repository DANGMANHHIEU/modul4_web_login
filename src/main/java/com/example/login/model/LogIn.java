package com.example.login.model;

public class LogIn {
    private String account;
    private String password;

    public LogIn() {
    }

    public LogIn(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LogIn{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
