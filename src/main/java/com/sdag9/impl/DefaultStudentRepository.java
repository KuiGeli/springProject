package com.sdag9.impl;

import com.sdag9.model.Student;
import com.sdag9.repositories.StudentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultStudentRepository extends DefRepositoryImpl<Student> implements StudentRepository {

    @Override
    public Student findByCnp(int cnp) {
        return entityList.stream().filter(student -> student.getCnp() == cnp).findFirst().orElse(null);
    }
}
