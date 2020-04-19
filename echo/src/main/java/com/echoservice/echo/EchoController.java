package com.echoservice.echo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("echo")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
}