package sqlapplication.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface MelodiiRepository extends CrudRepository<Melodii, Integer> {

}
