package com.sdag9;

import com.sdag9.model.School;
import com.sdag9.model.Student;
import com.sdag9.repositories.SchoolRepository;
import com.sdag9.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolManager {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public SchoolManager(SchoolRepository schoolRepository, StudentRepository studentRepository) {
//        this.schoolRepository = schoolRepository;
//        this.studentRepository = studentRepository;
//    }

    public void saveData() {
        Student student = new Student();
        student.setId(123L);
        student.setName("name");
        student.setCnp("5246321655583542");
        student.setAge(22);

        Student student1 = new Student();
        student1.setId(1234L);
        student1.setName("name1");
        student1.setCnp("5643543546454355");
        student1.setAge(23);

        School school = new School();
        student.setId(321L);
        school.setName("schoolName");

        School school1 = new School();
        student.setId(4321L);
        school.setName("schoolName1");



        schoolRepository.save(school);
        schoolRepository.save(school1);

        studentRepository.save(student);
        studentRepository.save(student1);

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
