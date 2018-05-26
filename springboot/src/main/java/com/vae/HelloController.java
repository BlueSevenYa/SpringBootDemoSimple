package com.vae;

import com.vae.entity.GirlPop;
import org.springframework.beans.factory.annotation.Autowired;
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

    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;*/

   /* @Value("${content}")
    private String content;*/

   @Autowired
   private GirlPop girlPop;

    @RequestMapping(value ={ "/hello","/hi"} ,method= RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!======="+girlPop.getCupSize();
    }
}
