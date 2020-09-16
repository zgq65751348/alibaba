package org.cloud.github.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping(value = "/origin")
public class OAuthController {

    @Value("${server.port}")
   private String port;

    @GetMapping(value = "/index")
    public Map<String,String> origin(){
        Map<String,String> map = new TreeMap<>();
        map.put("host","127.0.0.1");
        map.put("port",port);
        map.put("application","origin");
        return map;
    }
}
