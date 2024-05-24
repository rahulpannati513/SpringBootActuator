package org.rahul.springbootactuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class GreetingController {

    @GetMapping()
        public String greet() {
            return "Hello ! Welcome to Spring Boot Actuator";
        }
}
