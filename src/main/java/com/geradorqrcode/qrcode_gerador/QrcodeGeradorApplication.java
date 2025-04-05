package com.geradorqrcode.qrcode_gerador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QrcodeGeradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrcodeGeradorApplication.class, args);
		System.out.println("Teste de aplicação");
	}
}
