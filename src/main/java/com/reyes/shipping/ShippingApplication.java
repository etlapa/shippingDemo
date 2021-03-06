package com.reyes.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ShippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingApplication.class, args);
	}

}
