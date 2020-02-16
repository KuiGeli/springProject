package com.sdag9.model;

import javax.persistence.*;

@Entity
public class Student extends  DefaultModel {
    @Column
    private long cnp;

    @ManyToOne
    private School school;

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
