package uz.oybek.saylov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.oybek.saylov.model.FileStorage;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {
}
