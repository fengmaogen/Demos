package com.example.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fengmg
 * @Date: 2019/4/15 10:16
 * @Description:
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> request(){
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }
}
