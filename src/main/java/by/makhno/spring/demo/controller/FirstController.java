package by.makhno.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello, Ivan";
    }


}
