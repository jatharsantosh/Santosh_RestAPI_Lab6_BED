package org.gl.studentmanagement.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.gl.studentmanagement.entity.Role;
import org.gl.studentmanagement.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails{

private User user;

public MyUserDetails(User user) {
this.user = user;
}

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	List<Role> roles = user.getRoles();
	List<SimpleGrantedAuthority> authorities = new ArrayList<>();

	for (Role role : roles) {
		authorities.add(new SimpleGrantedAuthority(role.getName()));
	}
	return authorities;
}

@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return user.getPassword();
}

@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return user.getUserName();
}

@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
}

}

