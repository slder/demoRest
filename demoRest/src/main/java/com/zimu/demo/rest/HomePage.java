package com.zimu.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : sool
 * @date : 2018/12/29 20:54
 * @description:
 */

@RestController
@RequestMapping(value = "/homePage")
public class HomePage {
    @RequestMapping(value = "/hello")
    public String getPage(){
        return "hello sool!";
    }
}
