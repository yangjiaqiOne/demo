package com.example.demo.controller;

import com.example.demo.entity.TgDemo;
import com.example.demo.service.TgDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/app")
@Slf4j
public class DemoController {

    @Autowired
    private TgDemoService tgDemoService;

    @GetMapping("/test")
    public String getCode() {
        log.info("getCode[start]");
        log.info("getcdoe[end]");
        return "hello world";
    }

    @GetMapping("/list")
    public List<TgDemo> list() {
        return tgDemoService.list();
    }
}
