package br.iesb.poo.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// mvnw.cmd spring-boot:run
@SpringBootApplication(
//      exclude = {
//          org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
//          org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
//      }
)
@RestController
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
	
//	@GetMapping("/")
    public String hellov1() {
        return "Hello World";
    }

    
	record HelloResponse(String message) { }
    
	@GetMapping("/")
	public HelloResponse hellov2() {
		return new HelloResponse("Hello World");
	}
	
	
}
