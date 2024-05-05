package com.TRA2024.TRA24Sprintboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResetController {
    @GetMapping("Hi")
    public String test(){
        return "hello";
    }

}
