package com.springboot.demo.firstapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
     @GetMapping("/")
    public  String sayHello(){

        return "hello world";
    }



   @GetMapping("/workout")
    public String  getDailyWorkout(){
         return "you are doing workout....";
    }

    @GetMapping("/fortune")
    public String  getDailyfortune(){
        return "you are doing fortune....";
    }


}