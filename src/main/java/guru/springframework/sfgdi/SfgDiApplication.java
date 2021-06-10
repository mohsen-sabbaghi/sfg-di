package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        System.out.println(controller.greeting());

        System.out.println("------------- Property");
        PropertyInjectedControl propertyInjectedControl = (PropertyInjectedControl) context.getBean("propertyInjectedControl");
        System.out.println(propertyInjectedControl.greeting());

        System.out.println("------------- Setter");
        SetterInjectedControl setterInjectedControl = (SetterInjectedControl) context.getBean("setterInjectedControl");
        System.out.println(setterInjectedControl.greeting());

        System.out.println("------------- Constructor");
        ConstructorInjectedControl constructorInjectedControl = (ConstructorInjectedControl) context.getBean("constructorInjectedControl");
        System.out.println(constructorInjectedControl.getGreeting());


        System.out.println("------------- Primary ");
        PrimaryInjectedControl primaryInjectedControl = (PrimaryInjectedControl) context.getBean("primaryInjectedControl");
        System.out.println(primaryInjectedControl.greeting());


    }

}
