package com.j2ee.ticketing.controllers;

import com.j2ee.ticketing.entities.Users;
import com.j2ee.ticketing.entities.Tickets;
import com.j2ee.ticketing.services.UsersService;
import com.j2ee.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    private SendEmail sendEmail;

    @CrossOrigin(origins ="*")
    @GetMapping(path = "/users")
    public Users getUsers(@RequestParam(value = "id") Integer id) {
        return usersService.getUsersById(id);
    }
    
    /*
    @GetMapping(path = "/users/mail")
    public Users sendUserMail() {

		Email email = EmailBuilder.startingBlank()
		.from("hello", "antoinemousset1999@gmail.com")
		.to("M. Mousset", "antoinemousset1999@gmail.com")
		.withSubject("hey")
		.withPlainText("We should meet up! ;)")
		.buildEmail();
		mailer.sendMail(email);		
    }
    
*/
    
    @CrossOrigin(origins ="*")
    @PostMapping(path = "/sendMail")
    public Users sendUserMail(@RequestParam String email, @RequestParam String status) {
		return SendEmail.sendMail(email, status);	
    }
    
    @CrossOrigin(origins ="*")
    @PutMapping("/users")
    public Users addOrUpdatePatients(@RequestBody Users users) {
        return usersService.createOrUpdate(users);
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/users/all")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @CrossOrigin(origins ="*")
    @DeleteMapping("/users")
    public void deleteMessages(@RequestParam(value = "id") Integer id) {
    	usersService.deleteUsers(id);
    }
}
