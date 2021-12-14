package com.j2ee.ticketing.services;

import com.j2ee.ticketing.entities.Tickets;
import com.j2ee.ticketing.repositories.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsService{
    @Autowired
    private TicketsRepository ticketsRepository;


    public Tickets createOrUpdate(Tickets tickets) {
        return ticketsRepository.save(tickets);
    }

    public Tickets getTicketsById(Integer id) {
        return ticketsRepository.findById(id).orElse(null);
    }

    public List<Tickets> getTickets() {
        return ticketsRepository.findAll();
    }

    public void deleteTickets(Integer id) {
    	ticketsRepository.deleteById(id);
    }

}
