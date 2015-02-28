package com.levelup.service;

import com.levelup.model.Teacher;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public interface TeacherService {

    void createTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();
    Teacher getTeacherByName(String firstName);
}
