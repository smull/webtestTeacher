package com.levelup.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by SMULL on 26.02.2015.
 */
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{

    private Long id;

    private String name;

    private String group;

    private Teacher teacher;

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
