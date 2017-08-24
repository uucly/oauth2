package com.hascode.tutorial;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{


//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//				 .formLogin()
////				.loginPage("/login")
//                .permitAll()
//                .and().httpBasic().and().csrf().disable()
//                .logout()
//                .permitAll();
////		http.httpBasic().disable();
////		http
////				.authorizeRequests().antMatchers("/oauth/authorize/**").permitAll();
////        http
////                .authorizeRequests().antMatchers("/success").fullyAuthenticated();
////
////        http
////                .authorizeRequests().antMatchers("/test").permitAll();
//
//    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("user").password("password").roles("ADMIN");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin().permitAll();
//    }

    //    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication()
//                .withUser("detlef")
//                .password("np")
//                .roles("ADMIN");
//    }
}
