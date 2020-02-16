package com.sdag9.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class School extends DefaultModel {
    @OneToMany
    private List<Student> studentsList;

    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }

    public List<Student> getStudents() {
        return studentsList;
    }


}
