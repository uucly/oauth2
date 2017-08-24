package com.hascode.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.UUID;

@SpringBootApplication
@RestController
public class Oauth2AuthorizationServerApplication{

	public static void main(String[] args) {
		SpringApplication.run(Oauth2AuthorizationServerApplication.class, args);
	}

//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//
////		http.antMatcher("/**").authorizeRequests().antMatchers("/**").permitAll();
//		http
//				 .formLogin()
////				.loginPage("/login")
//				.permitAll()
//				.and().httpBasic().and().csrf().disable()
//				.logout()
//				.permitAll();
////		http.httpBasic().disable();
////		http
////				.authorizeRequests().antMatchers("/oauth/authorize/**").permitAll();
//		http
//				.authorizeRequests().antMatchers("/success").fullyAuthenticated();
//
//		http
//				.authorizeRequests().antMatchers("/test").permitAll();
//
//	}


	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}


	@RequestMapping("/loginprocess")
	public String loginProcess () {
		System.out.println("Login process");
		return "login process";
	}



	@RequestMapping(path = "/success", method = RequestMethod.GET)
	public String securedCall() {
		return "success (id: " + UUID.randomUUID().toString().toUpperCase() + ")";
	}

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}
}
