package uz.oybek.saylov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.oybek.saylov.model.Person;
import uz.oybek.saylov.service.PersonService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/people",
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.ALL_VALUE})
    public ResponseEntity<?> create(@RequestBody Person person) {
        System.out.println(person.toString());
        personService.save(person);
        return new ResponseEntity<>(person.toString(), HttpStatus.CREATED);
    }

    @PutMapping("/people")
    public ResponseEntity update(@RequestBody Person person) {
        Person person1 = personService.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/people")
    public ResponseEntity getAll() {
        List<Person> personList = personService.findAll();
        return ResponseEntity.ok(personList);
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        personService.delete(id);
        return ResponseEntity.ok("Qator o'chirildi!!!");

    }

}
