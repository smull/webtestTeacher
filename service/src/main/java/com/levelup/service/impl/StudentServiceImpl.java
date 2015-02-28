package com.levelup.service.impl;

import com.levelup.dao.StudentRepository;
import com.levelup.dao.TeacherRepository;
import com.levelup.dao.impl.StudentRepositoryImpl;
import com.levelup.dao.impl.TeacherRepositoryImpl;
import com.levelup.model.Student;
import com.levelup.service.StudentService;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository = new StudentRepositoryImpl();

    private TeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public void createStudent(Student student) {
        teacherRepository.createTeacher(student.getTeacher());
        studentRepository.createStudent(student);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public List<Student> getAllStudentsByTeacherId(Long id) {
        return studentRepository.getAllStudentsByTeacherId(id);
    }

    @Override
    public List<Student> getAllStudentsByName(String firstName, String lastName) {
        return studentRepository.getAllStudentsByName(firstName, lastName);
    }
}
