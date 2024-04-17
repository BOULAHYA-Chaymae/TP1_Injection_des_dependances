package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext springcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=springcontext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
