package br.com.lenin.hexagonalexemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonalExemploApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalExemploApplication.class, args);
    }

}
