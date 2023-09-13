package com.ethos.empresabackend;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpresaBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmpresaBackendApplication.class, args);
	}
}
