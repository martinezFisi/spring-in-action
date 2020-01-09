package action.in.spring.sample04xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:systemsound-beans.xml"})
public class Sample04XmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sample04XmlApplication.class, args);
	}

}
