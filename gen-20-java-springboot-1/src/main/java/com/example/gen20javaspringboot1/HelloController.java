package com.example.gen20javaspringboot1;

import org.springframework.web.bind.annotation.*;

// Mendefinisikan kelas sebagai REST controller yang menghasilkan data langsung ke body respons HTTP
@RestController
public class HelloController {

    // anotasi untuk method HTTP get
    @GetMapping("/hello")
    public  String hello(){
        return "Hello World";
    }

    //anotasi untuk method HTTP Post
    @PostMapping("/hello2")
    public  String hello2(@RequestParam(defaultValue = "World 2") String name){
        return "Hello " +name;
    }
    //anotasi untuk method fleksibel
    @RequestMapping("/hello3")
    public String hello3(){
        return "Hello World 3";
    }

}
