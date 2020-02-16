package com.sdag9;

import com.sdag9.impl.DefaultSchoolRepository;
import com.sdag9.impl.DefaultStudentRepository;
import com.sdag9.model.School;
import com.sdag9.model.Student;
import com.sdag9.repositories.SchoolRepository;
import com.sdag9.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolManager {

    private SchoolRepository schoolRepository = new DefaultSchoolRepository();
    private StudentRepository studentRepository = new DefaultStudentRepository();

    @Autowired
    public SchoolManager(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    public void saveData() {
        Student student = new Student();
        student.setId(123);
        student.setName("name");
        student.setCnp(5246321655583542L);

        Student student1 = new Student();
        student.setId(1234);
        student.setName("name1");
        student.setCnp(5643543546454355L);

        School school = new School();
        student.setId(321);
        school.setName("schoolName");

        School school1 = new School();
        student.setId(4321);
        school.setName("schoolName1");


        schoolRepository.create(school);
        schoolRepository.create(school1);

        studentRepository.create(student);
        studentRepository.create(student1);

    }

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
