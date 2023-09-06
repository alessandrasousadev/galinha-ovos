package br.com.galinhapoedeira.galinhaovos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GalinhaOvosApplication {

	public String getHomeTest() {
		return "Galinha e Ovos - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GalinhaOvosApplication.class, args);
	}

}
