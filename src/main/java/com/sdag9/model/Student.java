package com.sdag9.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class Student extends DefaultModel {
    @Column
    @Size(min = 13, max = 13, message = "CNP must have 13 characters!")
    private String cnp;

//    @ManyToOne
//    private School school;

    @Column
    @NotBlank(message = "Gender is mandatory")
    private String gender;
    @Column
    @Min(value = 1, message = "Age can't be less than 1")
    @Max(value = 150, message = "Age can't be more than 150")
    @NotNull(message = "Age can't be null")
    private Integer age;
    @Column
    @NotBlank(message = "First name is mandatory")
    private String firstName;
    @Column
    @NotBlank(message = "Last name is mandatory")
    private String lastName;
    @Column
    @NotBlank(message = "eMail is mandatory")
    private String eMail;

//    private Student(Builder builder) {
//        this.cnp = builder.cnp;
////        this.school = builder.school;
//        this.gender = builder.gender;
//        this.age = builder.age;
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.eMail = builder.eMail;
//    }

    public static Builder newStudent() {
        return new Builder();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

//    public School getSchool() {
//        return school;
//    }
//
//    public void setSchool(School school) {
//        this.school = school;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "cnp=" + cnp +
//                ", school=" + school +
//                '}';
//    }

    public static Builder instance(){
        return new Builder();
    }

    public static class Builder {
        private String cnp;
        private School school;
        private String gender;
        private int age;
        private String firstName;
        private String lastName;
        private String eMail;

        public Builder cnp(String cnp) {
            this.cnp = cnp;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            Student student = new Student();
            student.setCnp(cnp);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGender(gender);
            student.setAge(age);
            return student;
        }

        public Builder eMail(String eMail) {
            this.eMail = eMail;
            return this;
        }
    }

}
