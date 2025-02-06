package com.mercury.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Earth {

    @Autowired
    Mars obj;
    public void SpaceStation1()
    {
        System.out.println("We crossed Earth!!");
        obj.SpaceStation2();

    }
}
