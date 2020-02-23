package com.sdag9.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class School extends DefaultModel {
//    @OneToMany
//    private List<Student> studentsList;
    @Column
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//    public void setStudents(List<Student> students) {
//        this.studentsList = students;
//    }

//    public List<Student> getStudents() {
//        return studentsList;
//    }


}
