package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChefController {

    @GetMapping("/hello")
    @ResponseBody  // This tells Spring to return raw text instead of a view
    public String helloWorld() {
        return "hello jii";  // This will be returned as plain text
    }
}
