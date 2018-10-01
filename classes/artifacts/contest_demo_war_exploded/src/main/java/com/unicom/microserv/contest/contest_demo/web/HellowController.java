package com.unicom.microserv.contest.contest_demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contest/demo/")
public class HellowController {
    @RequestMapping("hello")
    public String hello(
            @RequestParam String name
    ) {
        return "Hello World: " + name;
    }

    @RequestMapping(
            value = "ping",
            method = RequestMethod.GET
    )
    public String ping() {
        return "pong";
    }
}
