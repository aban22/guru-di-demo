package guru.sprinframewrok.gurudidemo.controllers;

import guru.sprinframewrok.gurudidemo.service.GreetingService;
import guru.sprinframewrok.gurudidemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
