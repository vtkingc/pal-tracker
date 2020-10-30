package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
<<<<<<< HEAD
    private String msg;
    public WelcomeController(@Value("${welcome.message}") String msg) {
      this.msg = msg;
=======

    private String welcomeMessage;

    public WelcomeController(
            @Value("${welcome.message}") String welcomeMessage
    ) {
        this.welcomeMessage = welcomeMessage;
>>>>>>> tags/mvc-solution
    }

    @GetMapping("/")
    public String sayHello() {
<<<<<<< HEAD
        return msg;
    }
}
=======
        return welcomeMessage;
    }
}
>>>>>>> tags/mvc-solution
