package com.levelup.service.impl;

import com.levelup.dao.TeacherRepository;
import com.levelup.dao.impl.TeacherRepositoryImpl;
import com.levelup.model.Teacher;
import com.levelup.service.TeacherService;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public class TeacherServiceImpl implements TeacherService {

    TeacherRepository teacherRepository = new TeacherRepositoryImpl();

    @Override
    public void createTeacher(Teacher teacher) {
        teacherRepository.createTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    @Override
    public Teacher getTeacherByName(String firstName) {
        return teacherRepository.getTeacherByName(firstName);
    }
}
