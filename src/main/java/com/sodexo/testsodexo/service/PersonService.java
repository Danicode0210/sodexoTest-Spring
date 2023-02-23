package com.sodexo.testsodexo.service;

import com.sodexo.testsodexo.Comuna;
import com.sodexo.testsodexo.ComunasClient;
import com.sodexo.testsodexo.model.Person;
import com.sodexo.testsodexo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    private final ComunasClient comunasClient;

    public PersonService(ComunasClient comunasClient) {
        this.comunasClient = comunasClient;
    }

    public List<Comuna> getAllComunas() {
        return comunasClient.getAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }


}
