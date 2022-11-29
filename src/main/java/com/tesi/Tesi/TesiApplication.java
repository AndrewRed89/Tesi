package com.tesi.Tesi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //da eliminare una volta confing del Oracle
public class TesiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesiApplication.class, args);
		System.out.println("HEllo");

	}

}
