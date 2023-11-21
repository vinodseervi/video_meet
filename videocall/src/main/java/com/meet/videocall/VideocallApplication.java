package com.meet.videocall;

import com.meet.videocall.entity.User;
import com.meet.videocall.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(UserService userService){
		return args -> {
			userService.register(User.builder()
							.username("vinod")
							.email("vinod@gmail.com")
							.password("vinod@123")
					.build());

			userService.register(User.builder()
					.username("ishan")
					.email("ishan@gmail.com")
					.password("ishan@123")
					.build());

			userService.register(User.builder()
					.username("ankit")
					.email("ankit@gmail.com")
					.password("ankit@123")
					.build());

		};
	}
}
