package br.com.apuracao.eleicao2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableFeignClients
public class Eleicao2022Application {

	public static void main(String[] args) {
		SpringApplication.run(Eleicao2022Application.class, args);
	}
}

