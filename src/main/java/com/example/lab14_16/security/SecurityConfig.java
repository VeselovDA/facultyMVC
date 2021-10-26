package com.example.lab14_16.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder= User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("user")
                        .password("user").roles("USER"))
                .withUser(userBuilder.username("admin")
                        .password("admin").roles("ADMIN"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("USER","ADMIN")
                .antMatchers("/addPerson").hasRole("ADMIN")
                .antMatchers("/addEntrant").hasRole("ADMIN")
                .antMatchers("/addFaculty").hasRole("ADMIN")
                .antMatchers("/showListOnFaculty").hasAnyRole("USER","ADMIN")
                .and().formLogin().permitAll();
    }
}
