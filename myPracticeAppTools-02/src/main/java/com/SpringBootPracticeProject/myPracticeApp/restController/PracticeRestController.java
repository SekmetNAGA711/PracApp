package com.SpringBootPracticeProject.myPracticeApp.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //step 1
public class PracticeRestController {


    @GetMapping("/")//step 2
    public String sayHello() {
        return "Hello World!";
    }  // expose "/" that will return "Hello world"



    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
     public String getDailyFortune(){
        return "Today is your lucky day!";
    }


    @GetMapping("/routine")
    public String DailyRoutine() {
        return "Step right up to get your routine";
    }

}
