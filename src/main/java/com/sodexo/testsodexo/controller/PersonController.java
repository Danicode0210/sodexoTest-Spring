package com.sodexo.testsodexo.controller;

import com.sodexo.testsodexo.Comuna;
import com.sodexo.testsodexo.model.Person;
import com.sodexo.testsodexo.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/comunas")
    public ResponseEntity<List<Comuna>> getAllComunas() {
        List<Comuna> comunas = personService.getAllComunas();
        return new ResponseEntity<>(comunas, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAll() {
        List<Person> persons = personService.getAll();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Person> save(@Valid @RequestBody Person person) {
        Person savedPerson = personService.save(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }


}
