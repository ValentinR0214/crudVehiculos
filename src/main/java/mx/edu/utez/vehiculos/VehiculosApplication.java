package mx.edu.utez.vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class VehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculosApplication.class, args);
	}

}
