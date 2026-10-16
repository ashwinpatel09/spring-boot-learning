package com.ashwin.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.entity.Passport;
import com.ashwin.entity.Person;
import com.ashwin.repo.PassportRepository;
import com.ashwin.repo.PersonRepo;

@Service
public class PersonService {
    @Autowired
	private PersonRepo personRepo;
    
	@Autowired
	private PassportRepository passRepo;
	
	public void savePersonAndPassport() {
		 Person p = new Person();
		 p.setPersonName("john");
		 p.setPersonGender("Male");
		 
		 Passport pp = new Passport();
		 pp.setPassportNum("defg");
		 pp.setIssueDate(LocalDate.now());
		 pp.setExpiryDate(LocalDate.now().plusYears(10));
		 
		 p.setPassport(pp);
		 pp.setPerson(p);
		 
		 personRepo.save(p);
	}
	
	public void findPersonAndPassport(int personId) {
		    Optional<Person> byId = personRepo.findById(personId);
		    System.out.println(byId);
	}
}
