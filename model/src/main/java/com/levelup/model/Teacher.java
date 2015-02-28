package com.levelup.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable{

    private Long id;

    private String firstName;

    private String lastName;

    private List<Student> students;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
