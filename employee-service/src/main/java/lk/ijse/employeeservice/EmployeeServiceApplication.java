package lk.ijse.employeeservice;

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
 * @file EmployeeServiceApplication.java - main class of the employee-service
 * ---------------------------------------------
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}