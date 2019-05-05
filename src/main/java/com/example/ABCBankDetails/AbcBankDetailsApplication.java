package com.example.ABCBankDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ABCBankDetails")
public class AbcBankDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcBankDetailsApplication.class, args);
	}

}
