package com.hascode.tutorial;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
public class OAuth2ServerConfig extends AuthorizationServerConfigurerAdapter{


//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints.authenticationManager(new OAuth2AuthenticationManager());
//    }


    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;


    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager).tokenStore(new InMemoryTokenStore());
    }

//        @Override
//    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
//        oauthServer.checkTokenAccess("hasRole('CLIENT')");
//    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer.checkTokenAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        clients.inMemory()
                .withClient("foo")
                .secret("np")
                .authorizedGrantTypes("password")
                .scopes("read", "write")
                .and()
                .withClient("cred")
                .secret("cred")
                .authorizedGrantTypes("client_credentials")
                .scopes("trusted")
                .and()
                .withClient("authclient")
                .secret("auth")
                .authorizedGrantTypes("authorization_code")
                .scopes("read", "write")
                .and()
                .withClient("jsclient")
                .secret("123456")
                .authorizedGrantTypes("implicit")
                .scopes("read", "write")
                .authorities("CLIENT")
//                .redirectUris("http://localhost:9001/res-server/state/verify")
                .accessTokenValiditySeconds(3600)
                .autoApprove(true);
        ;
    }
}
