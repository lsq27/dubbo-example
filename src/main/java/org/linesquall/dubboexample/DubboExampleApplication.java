package org.linesquall.dubboexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DubboExampleApplication implements CommandLineRunner {

	@Autowired
	private StoreClient storeClient;

	public static void main(String[] args) {
		SpringApplication.run(DubboExampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		storeClient.getStores();
	}

}
