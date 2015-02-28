package com.levelup.service;

import com.levelup.model.Student;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public interface StudentService {


    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

    List<Student> getAllStudentsByTeacherId(Long id);
    List<Student> getAllStudentsByName(String firstName, String lastName);

}
