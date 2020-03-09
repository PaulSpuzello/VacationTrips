package vacation.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vacation.beans.Vacation;

@Configuration
public class BeanConfiguration {
	@Bean
	public Vacation vacation() {
		Vacation bean = new Vacation("Rhine Cruise", 5.5, 300);
		return bean;
	}
}
