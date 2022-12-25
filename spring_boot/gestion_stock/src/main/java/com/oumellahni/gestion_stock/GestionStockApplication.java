package com.oumellahni.gestion_stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GestionStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionStockApplication.class, args);
    }

}
