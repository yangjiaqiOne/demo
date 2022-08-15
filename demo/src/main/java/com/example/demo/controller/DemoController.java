package com.example.demo.controller;

import com.example.demo.entity.TgDemo;
import com.example.demo.service.TgDemoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/app")
@Slf4j
public class DemoController {

    @Autowired
    private TgDemoService tgDemoService;

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/test")
    public String getCode() {
        log.info("getCode[start]");
        // aaaa
        log.info("getcdoe[end]");
        return "hello world";
    }

    @GetMapping("/list")
    @ApiOperation(value = "列表")
    public List<TgDemo> list() {
        return tgDemoService.list();
    }

    @PostMapping("/code")
    @ApiOperation(value = "验证码")
    public String getCode(String mobileCode) {

        String code = (String) redisTemplate.opsForValue().get(mobileCode);

        if (StringUtils.isBlank(code)) {
            Long random = RandomUtils.nextLong(10000, 99999);
            redisTemplate.opsForValue().set(mobileCode , random.toString() , 5, TimeUnit.MINUTES);
            return random.toString();
        }
        return code;
    }

}
