package pl.tim3erland.open.springhateos.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tim3erland.open.springhateos.dao.ClazzDao;

public interface ClassRepository extends CrudRepository<ClazzDao, Integer> {

}
