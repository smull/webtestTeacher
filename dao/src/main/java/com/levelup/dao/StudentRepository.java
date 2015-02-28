package com.levelup.dao;

import com.levelup.model.Student;
import com.levelup.model.Teacher;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public interface StudentRepository {

    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

    List<Student> getAllStudentsByTeacherId(Long id);
    List<Student> getAllStudentsByName(String firstName, String lastName);

}
