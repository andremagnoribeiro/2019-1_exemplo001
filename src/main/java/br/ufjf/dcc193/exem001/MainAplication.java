package br.ufjf.dcc193.exem001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SocketUtils;

@SpringBootApplication
public class MainAplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAplication.class, args);
		System.out.println("Ola mundo");
	}

}
