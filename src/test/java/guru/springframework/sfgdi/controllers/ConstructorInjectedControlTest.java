package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControlTest {

    ConstructorInjectedControl control;

    @BeforeEach
    void setUp() {
        control = new ConstructorInjectedControl(new ConstructorGreetingService());
    }

    @Test
    void testGreeting() {
        System.out.println(control.getGreeting());
    }
}