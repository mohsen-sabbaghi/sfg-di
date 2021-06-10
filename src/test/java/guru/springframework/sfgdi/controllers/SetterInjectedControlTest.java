package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControlTest {

    SetterInjectedControl control;

    @BeforeEach
    void setUp() {
        control = new SetterInjectedControl() ;
        control.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void testGreeting() {
        System.out.println(control.greetingService.sayGreeting());
    }
}