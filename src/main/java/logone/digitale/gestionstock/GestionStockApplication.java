package logone.digitale.gestionstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //cette annotion dit a Spring d'éxecuter le projet en tant que projet Spring Boot
public class GestionStockApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);

		//Client client1 = new Client(1,"mta","tpkd","mta@gmail.com", CategorieClient.FIDELE);
	}
}
