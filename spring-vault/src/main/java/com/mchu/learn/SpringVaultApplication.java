package com.mchu.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.VaultException;
import org.springframework.vault.core.*;
import org.springframework.vault.support.VaultResponse;
import org.springframework.vault.support.VaultResponseSupport;
import org.springframework.web.client.RestClientException;

import java.util.List;

@SpringBootApplication
public class SpringVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultApplication.class, args);
	}

}
