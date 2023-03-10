package org.gl.studentmanagement.service;

import org.gl.studentmanagement.entity.User;
import org.gl.studentmanagement.repository.UserRepository;
import org.gl.studentmanagement.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired
	private UserRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
User user = userRepository.getUserByUserName(username);
		
		if (user == null) {
		throw new UsernameNotFoundException(" Could not find User")	;
		}
		
		return new MyUserDetails(user);
		
	}
	
}
