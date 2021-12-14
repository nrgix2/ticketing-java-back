package com.j2ee.ticketing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.ticketing.entities.Tickets;

public interface TicketsRepository extends JpaRepository<Tickets, Integer> {

}
