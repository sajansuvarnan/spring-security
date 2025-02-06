package com.mercury;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void code() {
        System.out.println("Laptop is called");
    }
}
