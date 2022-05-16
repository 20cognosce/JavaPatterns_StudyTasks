package Prac10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    Magician magician;

    @Autowired
    void doMagic(String bean) {
        magician = context.getBean(bean, Magician.class);
        magician.doMagic();
    }
}
