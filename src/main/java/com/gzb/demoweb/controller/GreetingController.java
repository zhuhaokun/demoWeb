package com.gzb.demoweb.controller;

import com.gzb.demoweb.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public User user(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name) {
        return new User(id, name);
    }
    @GetMapping("/error")
    public Map<String, String> user() {
        Map<String, String> map = new HashMap<>();
        map.put("id", "Please enter your id");
        map.put("name","Please enter your name");
        return map;
    }
}
