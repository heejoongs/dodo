package com.tobestplace.dodo.route;

import java.util.Optional;

import com.tobestplace.dodo.domain.Person;
import com.tobestplace.dodo.repo.PersonRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRoute {

    private final PersonRepo personRepo;

    public PersonRoute(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping("/persons")
    public ResponseEntity get() {
        Optional<Person> person = personRepo.findById(1L);
        System.out.println(person.get().getNo());
        System.out.println(person.get().getName());

        return ResponseEntity.ok(personRepo.findAll());
    }

}
