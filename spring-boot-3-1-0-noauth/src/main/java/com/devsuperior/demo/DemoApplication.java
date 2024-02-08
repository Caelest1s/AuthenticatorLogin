package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// @Autowired
	// private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	System.out.println("Encode = " + passwordEncoder.encode("123456"));

	// 	boolean result = passwordEncoder.matches("1234567", "$2a$10$eZ06MwljmlZQoSCjFPp8auOgjglRHOzvA6EMVzvEVMFPg6VZoGepi");
	// 	System.out.println("Resultado = " + result);
	// }


}
