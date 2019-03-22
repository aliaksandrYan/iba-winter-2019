package com.iba.courses.domain;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;
    private String password;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "university")
    @NotNull
    private String university;
    @Column(name = "course")
    @NotNull
    private Integer course;
    public Student(){

    }
    public Student(Integer id, String login, String password, String name, String university, Integer course) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.university = university;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", email='" + course + '\'' +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
