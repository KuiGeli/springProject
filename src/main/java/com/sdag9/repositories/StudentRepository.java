package com.sdag9.repositories;
import com.sdag9.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
//    Student findByCnp(int cnp);
//    List<Student> findByLastName(String name);
}
