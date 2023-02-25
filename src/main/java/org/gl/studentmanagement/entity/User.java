package org.gl.studentmanagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.gl.studentmanagement.entity.*;

import lombok.Data;

//@Data
@Entity
@Table(name="user")
public class User {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

@Column(name="username")
	private String userName;
@Column(name="password")
private String password;

@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinTable(name = "users_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
        )
private List<Role> roles = new ArrayList<>();




}

