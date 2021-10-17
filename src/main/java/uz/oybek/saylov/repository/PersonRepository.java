package uz.oybek.saylov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.oybek.saylov.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
