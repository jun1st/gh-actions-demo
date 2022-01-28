package me.fengqijun.ghactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengqijun
 */
@SpringBootApplication
@RestController
public class GhActionsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhActionsDemoApplication.class, args);
	}


	@GetMapping("/")
	public String hello() {
		return "{\"hello\" : \"world\"}";
	}
}
