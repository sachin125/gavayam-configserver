package com.gavayam.gconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GmConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmConfigServerApplication.class, args);
	}

}
