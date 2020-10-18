package pl.tim3erland.open.springhateos.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tim3erland.open.springhateos.dao.StudentDao;

public interface StudentRepository extends CrudRepository<StudentDao, Integer> {
}
