package com.forezp.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skq on 2019/1/25.
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;
    @GetMapping("hi")
    public String home(@RequestParam String name){
        return "hi "+name+",I am from port:" +port;
    }
}
