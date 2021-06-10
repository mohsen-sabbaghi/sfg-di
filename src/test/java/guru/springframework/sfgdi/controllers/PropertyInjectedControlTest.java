package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControlTest {

    PropertyInjectedControl propertyInjectedControl;

    @BeforeEach
    void setUp() {
        propertyInjectedControl = new PropertyInjectedControl();
        propertyInjectedControl.greetingService = new ConstructorGreetingService();
    }

    @Test
    void greeting() {
        System.out.println(propertyInjectedControl.greeting());
    }
}