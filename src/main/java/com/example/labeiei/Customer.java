package com.example.labeiei;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    String ID;
    String name;
    boolean sex;
    int age;
    public Customer(){
    }
    public Customer(String ID, String n, String s, int a){}
    public void setID(String ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        if(sex.toLowerCase() == "male"){
            this.sex = true;
        }
        else{
            this.sex = false;
        }
    }
    public void setAge(int age){
        if(age < 0){
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public String getID(String ID){
        return ID;
    }
    public String getName(String name){
        return name;
    }
    public boolean getSex(boolean sex){
        return sex;
    }
    public int getAge(int age){
        return age;
    }
}
