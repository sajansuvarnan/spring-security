package com.mercury;
import com.mercury.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = (Alien) context.getBean(Alien.class);

        obj.display();

/*        ApplicationContext context= new
                ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");

        obj.display();*/



    }
}
