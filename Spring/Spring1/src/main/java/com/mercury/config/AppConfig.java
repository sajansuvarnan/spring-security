package com.mercury.config;

import com.mercury.Alien;
import com.mercury.Computer;
import com.mercury.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mercury")
public class AppConfig {

 /*   @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean
    public Alien alien( @Autowired Computer com)
    {
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);

        return obj;
    }*/
}
