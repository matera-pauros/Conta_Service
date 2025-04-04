package com.example.Conta_Service_2025;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Conta Service", version = "1", description = "APIs para gerenciamento de contas"))
public class ContaService2025Application {

	public static void main(String[] args) {
		SpringApplication.run(ContaService2025Application.class, args);
	}

}
