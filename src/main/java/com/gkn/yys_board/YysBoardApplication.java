package com.gkn.yys_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YysBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(YysBoardApplication.class, args);
	}

}
