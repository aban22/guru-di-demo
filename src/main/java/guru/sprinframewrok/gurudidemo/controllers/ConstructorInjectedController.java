package guru.sprinframewrok.gurudidemo.controllers;

import guru.sprinframewrok.gurudidemo.service.GreetingService;
import guru.sprinframewrok.gurudidemo.service.GreetingServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
