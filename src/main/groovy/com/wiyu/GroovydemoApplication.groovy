package com.wiyu

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GroovydemoApplication {

	static void main(String[] args) {
		SpringApplication.run GroovydemoApplication, args

		println "hello"
	}
}
