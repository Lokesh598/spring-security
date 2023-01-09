package com.lvg.ojdemo.config;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
public class AppConfig extends WebSecurityConfigurerAdapter
{
      public void configure(HttpSecurity hs) throws Exception
      {
    	  hs.requestMatchers()
    	  .antMatchers("/login")
    	  .and()
    	  .authorizeRequests()
    	  .anyRequest()
    	  .authenticated()
    	  .and()
    	  .formLogin()
    	  .permitAll();
      }
}
