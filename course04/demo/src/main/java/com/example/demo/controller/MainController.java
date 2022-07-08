package com.example.demo.controller;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.Customer;
  @RestController
  public class MainController{
    @GetMapping({"/","/hello"})
    @ResponseBody
    public String index() {
        return "<h1>Hi!</h1>";
    }
    @GetMapping("/request")
    @ResponseBody
    public String request(HttpServletRequest request) {
      //System.out.println("get");
      String name = request.getParameter("id");
      return name;
    }
    @PostMapping("/request")
    @ResponseBody
    public String[] postRequest(@ModelAttribute Customer customer) {
      String name = customer.getName();
      int age = customer.getAge();
      String ageStr = String.valueOf(age);
      return new String[]{name, ageStr};
    }
}