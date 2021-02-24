package com.yowu.playground.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping
  public String root() {
    return "Hello Root";
  }

  @GetMapping("/")
  public String hello(@RequestParam(value = "name", defaultValue = "yowu") String name) {
    return "Hello " + name;
  }
}
