package com.morrowind.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author link.xu
 * @date 2022/12/7
 */
@RestController
public class HomeController {

    @GetMapping("/hi")
    public String hi(){
        return "Hello! this is link's website server.";
    }
}
