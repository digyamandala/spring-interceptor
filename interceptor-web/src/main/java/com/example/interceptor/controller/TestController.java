package com.example.interceptor.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

  @GetMapping("/greet")
  public String hi() {
    System.out.println("endpoint hit");
    return "hi";
  }
}
