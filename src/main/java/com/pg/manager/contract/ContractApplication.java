package com.pg.manager.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.pg.manager.contract.controllers"})
public class ContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractApplication.class, args);
	}

}
