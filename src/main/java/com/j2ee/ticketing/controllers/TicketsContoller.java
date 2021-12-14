package com.j2ee.ticketing.controllers;

import com.j2ee.ticketing.entities.Tickets;
import com.j2ee.ticketing.services.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketsContoller {
    @Autowired
    private TicketsService ticketsService;

    @GetMapping(path = "/tickets")
    public Tickets getTickets(@RequestParam(value = "id") Integer id) {
        return ticketsService.getTicketsById(id);
    }

    @PutMapping("/tickets")
    public Tickets addOrUpdateTickets(@RequestBody Tickets tickets) {
        return ticketsService.createOrUpdate(tickets);
    }

    @GetMapping("/tickets/all")
    public List<Tickets> getTickets() {
        return ticketsService.getTickets();
    }

    @DeleteMapping("/tickets")
    public void deleteTickets(@RequestParam(value = "id") Integer id) {
    	ticketsService.deleteTickets(id);
    }
}