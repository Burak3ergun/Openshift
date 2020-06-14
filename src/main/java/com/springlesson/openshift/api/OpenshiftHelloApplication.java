package com.springlesson.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftHelloApplication {

	@GetMapping("/")
	public String welcome() {
		
		return "Hello Openshift" ;
		
	}
	
	@GetMapping("/{input}")
	public String welcome_in(@PathVariable String input) {
		
		return "Hello " + input + "Openshift" ;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftHelloApplication.class, args);
	}

}
