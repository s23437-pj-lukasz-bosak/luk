package pl.pjakt.luk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LukApplication {
		private final CarService carService;

	public LukApplication(CarService carService){
		this.carService = carService;

		// to jest nasz main od dzisiaj

		System.out.println(carService.getAllCars());
		System.out.println(carService.getAllRentals()); // jeszcze dodac to to string to smierdzace enum. pamietac



	}

	public static void main(String[] args) {
		SpringApplication.run(LukApplication.class, args);
	}

}
