package com.mudit.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//serves at localhost:8080/hell0

@RestController
@RequestMapping("/hello")
public class helloController {
    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("times") int times){
        String ans = "";
        for(int i = 0; i < times; i++){
            ans += "Hello " + name;
            ans += "<br>";
        }
        return ans;
    }
}
