package com.rony.sm.po;

public class User {
    private int ID;
    private String password;
    private int role;

    public User(int ID, String password, int role) {
        this.ID = ID;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
