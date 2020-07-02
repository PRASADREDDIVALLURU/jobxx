package com.example.findmyjob;
public class Pojo{
    public String un,phno, mail;

    public Pojo(){

    }
    public Pojo(String name, String phone, String email) {
        this.un = name;

        this.phno = phone;
        this.mail = email;
    }
    public String getName() {
        return un;
    }

    public void setName(String name) {
        this.un = name;
    }

    public String getPhone() {
        return phno;
    }

    public void setPhone(String phone) {
        this.phno = phone;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = email;
    }



}