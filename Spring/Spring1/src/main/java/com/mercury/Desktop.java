package com.mercury;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void code() {
        System.out.println("Desktop is called");
    }
}
