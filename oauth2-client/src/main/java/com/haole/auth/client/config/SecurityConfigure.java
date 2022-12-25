package com.haole.auth.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.DigestAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.DigestAuthenticationFilter;

/**
 * ClassName: SecurityConfigure
 *
 * @description:
 * @author: shengjunzhao
 * @date: 2022/12/23 0023 18:26
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigure {

    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated();
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }

//    DigestAuthenticationEntryPoint authenticationEntryPoint() {
//        DigestAuthenticationEntryPoint result = new DigestAuthenticationEntryPoint();
//        result.setRealmName("My App Realm");
//        result.setKey("3028472b-da34-4501-bfd8-a355c42bdf92");
//    }
//
//    DigestAuthenticationFilter digestAuthenticationFilter() {
//        DigestAuthenticationFilter result = new DigestAuthenticationFilter();
//        result.setUserDetailsService(userDetailsService);
//        result.setAuthenticationEntryPoint(authenticationEntryPoint());
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated();
//        http.exceptionHandling(e -> e.authenticationEntryPoint(authenticationEntryPoint()))
//                .addFilterBefore(digestAuthenticationFilter());
//        return http.build();
//    }
}
