package com.j2ee.ticketing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name="tickets")
public class Tickets {
	
	 	@Id
	 	@Valid
	    @Column(name="Name")
	    private String name;

	 	@Valid
	    @Column(name="status", length=30, nullable=false)
	    private String status;

	 	
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

	}

