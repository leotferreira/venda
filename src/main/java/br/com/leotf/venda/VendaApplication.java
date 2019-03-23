package br.com.leotf.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.leotf.venda.services.S3Service;


@SpringBootApplication
public class VendaApplication implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(VendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\temp\\fotos\\ana.jpg");
		
	
		
		
	}

}
