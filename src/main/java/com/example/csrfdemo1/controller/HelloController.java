package com.example.csrfdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "GET Hello!";
    }
// curl -X POST localhost:8080/hello -H 'Cookie:JSESSIONID=604FDAC0ACF6462FE7A9C936EFB46277' -H 'X-CSRF-TOKEN: 0LUB7IjsQS5B4vH-v063xf0yktQ9ZZWdnC9NJB_2ZzEFId0PtoZi1OvbchZs05XNjmODp8oEv7YMA6Sw_UwrEXvPBlMxQrxp'
    @PostMapping("/hello")
    public String postHello(){
        return "POST Hello!";
    }
}
