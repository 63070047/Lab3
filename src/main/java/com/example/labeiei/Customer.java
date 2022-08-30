package com.example.labeiei;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    String ID;
    String name;
    boolean sex;
    int age;
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
