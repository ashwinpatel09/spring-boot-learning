package com.ashwin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwin.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
