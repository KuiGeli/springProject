package com.sdag9.model;

import com.sdag9.repositories.SchoolRepository;

import java.util.List;

public class School implements DefaultModel {
    private  int id;
    private String name;
    private List<Student> studentsList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }

    public List<Student> getStudents() {
        return studentsList;
    }


}
