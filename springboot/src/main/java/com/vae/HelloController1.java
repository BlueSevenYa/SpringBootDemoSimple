package com.vae;

import com.vae.entity.Lan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2017-03-16-14:10
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/lan")
public class HelloController1 {

    @RequestMapping("/{id}")
    public Lan view(@PathVariable("id") int id){
        Lan lan=new Lan();
        lan.setId(id);
        lan.setName("蓝十七");
        return lan;
    }

   /* public  static void main(String [] args){
        SpringApplication.run(Lan.class);
    }*/
}
