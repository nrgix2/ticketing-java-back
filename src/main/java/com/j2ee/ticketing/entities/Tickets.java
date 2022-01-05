package com.j2ee.ticketing.entities;

import javax.persistence.Column;
import com.j2ee.ticketing.entities.Users;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name="tickets")
public class Tickets {
	
	 
		@Id
		@Column(name="id", unique=true, nullable=false)
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int id;
	
	 	@Valid
	    @Column(name="Name")
	    private String name;

	 	@Valid
	    @Column(name="status", length=255, nullable=false)
	    private String status;

	 	
	 	@Valid
	    @Column(name="description", length=255, nullable=false)
	    private String description;
	 	
	 	 @ManyToOne()
	     @JoinColumn(name = "admin_id")
	     private Users admin;
	 	 
	 	 @ManyToOne()
	     @JoinColumn(name = "user_id")
	     private Users user;


		public Users getAdmin() {
			return admin;
		}

		public void setAdmin(Users admin) {
			this.admin = admin;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public String getName() {
			return name;
		} 

		public void setName(String name) {
			this.name = name;
		}

		
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
		public String getDescription() {
			return description;
		}

		
		public int getId() { 
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	}

