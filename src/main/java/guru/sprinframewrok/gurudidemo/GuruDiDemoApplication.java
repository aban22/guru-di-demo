package guru.sprinframewrok.gurudidemo;

import guru.sprinframewrok.gurudidemo.controllers.ConstructorInjectedController;
import guru.sprinframewrok.gurudidemo.controllers.MyController;
import guru.sprinframewrok.gurudidemo.controllers.PropertyInjectedController;
import guru.sprinframewrok.gurudidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GuruDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(GuruDiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }

}

