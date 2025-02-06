package com.mercury;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;

    @Autowired
    @Qualifier("desktop")
    private Computer com;

/*    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void display()
    {
        System.out.println("Alien is called");
        com.code();
    }
}
