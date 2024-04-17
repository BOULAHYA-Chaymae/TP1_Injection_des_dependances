package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.SocketOption;

public class PresVersionSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());


    }
}
