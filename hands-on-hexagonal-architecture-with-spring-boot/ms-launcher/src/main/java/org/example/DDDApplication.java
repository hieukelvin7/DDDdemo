package org.example;

import org.example.entity.User;
import org.exemple.data.UserDto;
import org.exemple.ports.api.UserServicePort;
import org.exemple.ports.spi.UserPersistencePort;
import org.exemple.service.UserServicePortImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableWebSecurity
@RestController
public class DDDApplication {

	public static void main(String[] args) {
		SpringApplication.run(DDDApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
@Bean
CommandLineRunner commandLineRunner (UserServicePort userServicePort){
	return args -> {
		userServicePort.saveUser(new UserDto(1L,"hieu","hieu","123456","ADMIN"));
//			userService.saveUser(new User("nguyen van a","nva","123456",Role.ADMIN));
//			userService.saveUser(new User("le van b","lvb","123456",Role.USER));
//			userService.saveUser(new User("nguyen duc long","long","123456",Role.USER));
		userServicePort.saveUser(new UserDto(2L,"nguyen duc long","long","123456","USER"));
	};
}
}
