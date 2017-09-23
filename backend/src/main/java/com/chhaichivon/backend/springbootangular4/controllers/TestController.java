package com.chhaichivon.backend.springbootangular4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 9/1/2017
 * TIME   : 2:49 PM
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "Hello";
    }
}
