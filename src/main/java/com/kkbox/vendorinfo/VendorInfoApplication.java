package com.kkbox.vendorinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kkbox")
public class VendorInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorInfoApplication.class, args);
	}

}
