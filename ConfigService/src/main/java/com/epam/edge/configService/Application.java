package com.epam.edge.configService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(Application.class).run(args);
	}

}
