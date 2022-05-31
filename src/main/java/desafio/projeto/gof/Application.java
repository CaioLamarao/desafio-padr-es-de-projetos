package desafio.projeto.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto gerado via Spring Initializr.
 * Utilizando os seguintes módulos:
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeign
 * - Spring Web
 * 
 * @author Caio Lamarão
 *
 */


@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
