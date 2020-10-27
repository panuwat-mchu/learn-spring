package com.mchu.learn;

import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final VaultTemplate vaultTemplate;

    public HomeController(VaultTemplate vaultTemplate) {
        this.vaultTemplate = vaultTemplate;
    }

    @GetMapping(path = "/home")
    public void index(){
        System.out.println("home work!");
        String credentials = "hello";
        vaultTemplate.write("credentials/myapp", credentials);

        VaultResponseSupport<String> response = vaultTemplate.read("credentials/myapp", String.class);
        System.out.println("home work!");
    }
}
