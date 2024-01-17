package com.SpringBootPracticeProject.myPracticeApp.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //step 1
public class PracticeRestController {


    @GetMapping("/")//step 2
    public String sayHello() {
        return "Hello World!";
    }  // expose "/" that will return "Hello world"


}
