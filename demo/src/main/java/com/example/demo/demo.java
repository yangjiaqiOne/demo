package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class demo {

    @GetMapping("/test")
    public String getCode() {
        return "hello request";
    }
}
