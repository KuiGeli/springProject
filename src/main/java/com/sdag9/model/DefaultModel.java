package com.sdag9.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class DefaultModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column
    protected String name;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    };

    public String getName(){
        return name;
    };

    public void setName(String name){
        this.name = name;
    };

//    public <T> List<T> getStudents();

//    public <T> void setStudents(List<T> students);

}
