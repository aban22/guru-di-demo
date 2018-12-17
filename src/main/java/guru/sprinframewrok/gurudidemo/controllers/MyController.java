package guru.sprinframewrok.gurudidemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("Helo!!!");
        return "foo";
    }
}
