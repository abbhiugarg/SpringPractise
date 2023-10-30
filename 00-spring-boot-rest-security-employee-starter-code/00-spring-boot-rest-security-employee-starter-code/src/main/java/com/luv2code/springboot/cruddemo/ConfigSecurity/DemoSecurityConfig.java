package com.luv2code.springboot.cruddemo.ConfigSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(){
//
//        UserDetails john = User.builder()
//                           .username("john")
//                           .password("{noop}test123")
//                           .roles("EMPLOYEE")
//                           .build();
//
//        UserDetails mary = User.builder()
//                           .username("mary")
//                           .password("{noop}test123")
//                           .roles("EMPLOYEE","MANAGER")
//                           .build();
//
//        UserDetails susan = User.builder()
//                            .username("susan")
//                            .password("{noop}test123")
//                            .roles("EMPLOYEE","MANAGER","ADMIN")
//                             .build();
//
//        return new InMemoryUserDetailsManager(john,mary,susan);
//    }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){

        // this is use when we use predefined table schema like table name,column name
        //return new JdbcUserDetailsManager(dataSource);

        // but if we want to use our own custom table of users and role
        // so in that case we write code to configure our custom tables into spring security
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select user_id,pw,active from members where user_id=?");
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select user_id,role from roles where user_id=?");
        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("FACULTY")
                        .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("FACULTY")
                        .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN"));

                http.httpBasic(Customizer.withDefaults());

                http.csrf(csrf -> csrf.disable());

                return http.build();
    }
}
