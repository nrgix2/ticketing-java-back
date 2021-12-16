package com.j2ee.ticketing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class Users {
	
	
		@Id
		@Column(name="id", unique=true, nullable=false)
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int id;
	
	 	@Valid
	    @Column(name="Username")
	    private String username;

	 	@Valid
	    @Column(name="firstname", length=30, nullable=false)
	    private String firstname;

	 	@Valid
	    @Column(name="lastname", length=30, nullable=false)
	    private String lastname;
	 	
	 	@Valid
	    @Column(name="role", length=30, nullable=false)
	    private String role;
	 	
	 	@Valid
	 	@JsonIgnore
	    @Column(name="password", length=30, nullable=false)
	    private String password;

	 	public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Valid
	    @Column(name="telephone")
	    private int telephone;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getTelephone() {
			return telephone;
		}

		public void setTelephone(int telephone) {
			this.telephone = telephone;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

}
