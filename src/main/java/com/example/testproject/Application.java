package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@Configuration
@ImportResource(locations={"classpath:*/Spring.xml"})
@EnableCaching
public class Application  extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
	@Bean
	public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return  characterEncodingFilter;
    }
}
