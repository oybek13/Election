package uz.oybek.saylov.service;

import org.springframework.stereotype.Service;
import uz.oybek.saylov.model.Person;
import uz.oybek.saylov.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public void delete(Long id){
        Person person = personRepository.getOne(id);
        personRepository.delete(person);
    }


}
