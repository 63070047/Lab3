package com.example.labeiei;

import java.util.Random;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePasswordService {

    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name){
        Random ran = new Random();
        int randompwd = ran.nextInt(1000000);
        return "Hi" + name + "<br>" + "Your new password is " + randompwd;
    }
}
