package com.example.labeiei;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    public Customer(){
        this("",null,"female",0);
    }
    public Customer(String ID, String n, String s, int a){
        if(a < 0){
            a = 0;
        }
        if(s.toLowerCase().equals("male")){
            this.sex = true;
        } else if (s.toLowerCase().equals("female")) {
            this.sex = false;
        }
        this.ID = ID;
        this.name = n;
        this.age = a;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        if(sex.toLowerCase().equals("male")){
            this.sex = true;
        }
        else if (sex.toLowerCase().equals("female")) {
            this.sex = false;
        }
    }
    public void setAge(int age){
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }

    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public boolean getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
}
