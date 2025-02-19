package lk.ijse.eurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
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
 * @file EurekaDiscoveryServerApplication.java - main class of the eureka-discovery-server
 * ---------------------------------------------
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
    }
}