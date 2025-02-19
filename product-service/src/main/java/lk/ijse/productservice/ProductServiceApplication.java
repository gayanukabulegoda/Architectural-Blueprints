package lk.ijse.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * ---------------------------------------------
 * @author Gayanuka Bulegoda
 * @portfolio https://grbulegoda.me/
 * @github https://github.com/gayanukabulegoda
 * ---------------------------------------------
 * @project Architectural-Blueprints
 * @repository https://github.com/gayanukabulegoda/Architectural-Blueprints
 * @since 2025-02-19
 * ---------------------------------------------
 * @file ProductServiceApplication.java - main class of the product-service
 * ---------------------------------------------
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}