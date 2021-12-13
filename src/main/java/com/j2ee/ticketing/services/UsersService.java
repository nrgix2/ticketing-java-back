package com.j2ee.ticketing.services;

import com.j2ee.ticketing.entities.Users;
import com.j2ee.ticketing.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService{
    @Autowired
    private UsersRepository usersRepository;


    public Users createOrUpdate(Users users) {
        return usersRepository.save(users);
    }

    public Users getUsersById(Integer id) {
        return usersRepository.findById(id).orElse(null);
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public void deleteUsers(Integer id) {
    	usersRepository.deleteById(id);
    }

}
