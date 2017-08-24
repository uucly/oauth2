//package com.hascode.tutorial;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
//
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
//
////    @Override
////    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
////        RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
////        remoteTokenServices.setClientId("resclient");
////        remoteTokenServices.setClientSecret("resclient");
////        remoteTokenServices.setCheckTokenEndpointUrl("http://localhost:8080/authorization-server/oauth/check_token");
////        resources.tokenServices(remoteTokenServices);
////    }
//
//}
