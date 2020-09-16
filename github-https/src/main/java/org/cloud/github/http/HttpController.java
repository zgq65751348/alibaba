package org.cloud.github.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/http")
public class HttpController {

    @GetMapping(value = "/index")
    public String http(){
        return "http";
    }
}
