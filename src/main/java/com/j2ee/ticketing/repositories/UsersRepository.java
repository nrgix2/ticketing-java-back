package com.j2ee.ticketing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j2ee.ticketing.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
