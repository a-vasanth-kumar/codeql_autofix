package com.javaexamples.codeql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(@RequestParam(value = "username", defaultValue = "name") String username) {
        log.warn("User:'{}'", username);
        // The logging call above would result in multiple log entries as shown below:
        // User:'Guest'
        // User:'Admin'
        return username;
    }
}
