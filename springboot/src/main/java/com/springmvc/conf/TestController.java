package com.springmvc.conf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fengmg
 * @Date: 2019/4/12 16:25
 * @Description:
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key","value");
        return map;
    }
}
