package me.afua.githuboauthexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class GithuboauthexampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(GithuboauthexampleApplication.class, args);
	}
}
