package com.tobestplace.dodo;

import com.tobestplace.dodo.domain.Person;
import com.tobestplace.dodo.repo.PersonRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Optional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@SpringBootTest
public class PersonRepoTests {

    @Autowired
    private PersonRepo personRepo;

    @Test
    @Transactional
    public void test() {
        final Optional<Person> personOpt = personRepo.findById(1L);

        assertTrue(personOpt.isPresent());

    }
}
