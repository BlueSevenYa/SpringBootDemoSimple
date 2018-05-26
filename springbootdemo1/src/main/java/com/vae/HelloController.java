package com.vae;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2017-03-16-13:27
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" ,method= RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
}
