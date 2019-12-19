package action.in.spring.sample02wiringbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Sample02WiringBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sample02WiringBeansApplication.class, args);
		System.out.println("Hola mundo");
	}

}
