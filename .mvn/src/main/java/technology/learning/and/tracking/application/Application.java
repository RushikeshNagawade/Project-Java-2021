package technology.learning.and.tracking.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static final Logger LOG = LoggerFactory.getLogger(Hello.class); 

	public static void main(String[] args) {
		
		LOG.info("start");
		//System.out.println("start");
		SpringApplication.run(Application.class, args);
		LOG.info("End");
		
	}

}
