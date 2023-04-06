package relation;

import com.example.springonm.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Supplier, Long> {


}
