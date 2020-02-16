package com.sdag9.repositories;
import com.sdag9.model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends DefaultRepository<Student> {

    Student findByCnp(int cnp);

}
