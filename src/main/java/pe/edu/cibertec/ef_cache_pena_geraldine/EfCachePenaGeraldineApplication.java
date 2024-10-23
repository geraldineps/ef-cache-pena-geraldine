package pe.edu.cibertec.ef_cache_pena_geraldine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EfCachePenaGeraldineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfCachePenaGeraldineApplication.class, args);
	}

}
