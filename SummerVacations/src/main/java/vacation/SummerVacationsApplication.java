package vacation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vacation.beans.Vacation;
import vacation.controller.BeanConfiguration;
import vacation.repository.VacationRepository;

@SpringBootApplication
public class SummerVacationsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SummerVacationsApplication.class, args);
	}
	
	@Autowired
	VacationRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		Vacation vac = new Vacation("Italian Tour", 8, 30);
		
		Vacation vac2 = new Vacation("Ancient Greece", 10, 25);
		
		repo.save(vac);
		repo.save(vac2);
		
		List<Vacation> allMyVacations = repo.findAll();
		for(Vacation vacations: allMyVacations) {
			System.out.println(vacations.toString());
		}
	}

}
