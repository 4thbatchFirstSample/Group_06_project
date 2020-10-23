package com.spring.boot.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.spring.boot.services.DefectService;



@Configuration
@EnableWebSecurity 
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encodePWD());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("api/v1/defect/**").authenticated().anyRequest().permitAll().and()
//		.authorizeRequests().antMatchers("/auth/**").authenticated().anyRequest().hasAnyRole("USER").and().formLogin().permitAll();
//		
//		http.authorizeRequests().antMatchers()
//		
		//http.authorizeRequests().antMatchers("/api/v1/defect/**").permitAll().and().authorizeRequests().antMatchers("/auth/**").hasAnyRole("user").anyRequest().authenticated().and().formLogin().permitAll();
		
		http.authorizeRequests()
		.antMatchers("/auth/**").hasRole("user")
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll()
		.and()
		.logout().permitAll();
////		
//		http.authorizeRequests()
//		.antMatchers("/auth").hasRole("user")
//		.antMatchers("/api/v1/defect").permitAll()
//		.and().formLogin();

		
	}
	
	@Bean
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	
	
}
  