package hello;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String listTemplate = "List, %s-%d!";
    private final AtomicLong counter = new AtomicLong();
    private final AtomicLong listCounter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello";
    }
    
}