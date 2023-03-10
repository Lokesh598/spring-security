package com.lvg.ojdemo.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class User 
{
     @Id
     @Column(name="user_id")
     private long id;
     
     @Column(name="username")
     private String username;
     
     @Column(name="email")
     private String email;
     
     @Column(name="password")
     private String password;
     
     @ManyToMany(fetch = FetchType.LAZY)
 	 @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
 	 private Set<Role> roles = new HashSet<>();
     
     public User() {}

	public User(String username, String email, String password) 
	{
		this.username = username;  this.email = email;		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	} 
     
}
