package com.crud.tokobangunan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.crud.tokobangunan.model"})
public class TokobangunanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokobangunanApplication.class, args);
	}

}
