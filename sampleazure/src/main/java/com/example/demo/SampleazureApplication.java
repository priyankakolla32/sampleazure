package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SampleazureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleazureApplication.class, args);
	}

	@Controller
	public class HomeController {
	    @RequestMapping("/home")
	    public String home(){
	        return "home";
	    }
	}
	
	
}
