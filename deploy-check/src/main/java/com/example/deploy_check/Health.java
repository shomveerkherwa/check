package com.example.deploy_check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Health {
	
	 @GetMapping("/")
	    public String hello() {
	        return "Hello, World!";
	    }

}
