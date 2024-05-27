package com.joao.crud_dicionario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.joao.crud_dicionario.model.Course;
import com.joao.crud_dicionario.repository.CourseRepository;

@SpringBootApplication
public class CrudDicionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDicionarioApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Java");
			c.setCategory("Back-end");
			courseRepository.save(c);

			Course d = new Course();
			d.setName("Angular");
			d.setCategory("Front-end");
			courseRepository.save(d);
		};
	}
}
