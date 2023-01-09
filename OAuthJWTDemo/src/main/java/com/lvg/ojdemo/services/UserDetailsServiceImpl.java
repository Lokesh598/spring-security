package com.lvg.ojdemo.services;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lvg.ojdemo.entity.User;
import com.lvg.ojdemo.repository.UserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	 @Autowired
	  UserRepository userRepository;

	  @Override
	  @Transactional
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	  {
	    User user = userRepository.findByUsername(username)
	        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

	    return UserDetailsImpl.build(user);
	  }  
}
