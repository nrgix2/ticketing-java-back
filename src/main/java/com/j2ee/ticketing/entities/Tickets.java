package com.j2ee.ticketing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	    @Column(name="status", length=30, nullable=false)
	    private String status;
	 	
	 	@Valid
	    @Column(name="descritpion", length=30, nullable=false)
	    private String descritpion;

	 	
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
			return status;
		}

		public void setDescription(String descritpion) {
			this.descritpion = descritpion;
		}
		
		public int getId() { 
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	}

