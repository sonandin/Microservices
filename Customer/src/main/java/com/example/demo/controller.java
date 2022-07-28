package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Configuration
@Controller
public class controller {
    @GetMapping(path="/hello-world")  
    public String helloWorld() 

    {
        return "HelloWorld";

    }

    @GetMapping(path="/hello-world-bean")
    public <helloWorld> helloworld helloWorldBean()
    {
        return new helloworld("Hello World");
    }


   @GetMapping(path="/hello-world/path-variable/{name}")
    public helloworld helloWorldPathVariable(@PathVariable String name) 
    {
        return new helloworld(String.format("Hello world,%s", name));
    }
}