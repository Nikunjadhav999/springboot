package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * The controller will ensure that the class will control how object will be used
 * It is done using 2 parts
 * 1. get mapping
 * 2. request parameter
 * 
 */
@RestController
public class GreetingController {
    /*
     * %s is the placeholder for a string value.
     * For example, if the user inputs "Nikunj", the result will be "Hello, Nikunj welcome to hotel"
     */
    private static final String template = "Hello, %s welcome to hotel"; 
    
    // AtomicLong is a data type that will handle large data
    private final AtomicLong atomicLong = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Nikunj") String name) {
        return new Greeting(atomicLong.incrementAndGet(), String.format(template, name));
    }
    
   
}
