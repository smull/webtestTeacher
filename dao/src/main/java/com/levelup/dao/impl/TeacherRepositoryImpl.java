package com.levelup.dao.impl;

import com.levelup.dao.HibernateSessionProvider;
import com.levelup.model.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public class TeacherRepositoryImpl implements com.levelup.dao.TeacherRepository {

    public TeacherRepositoryImpl() {
    }

    @Override
    public void createTeacher(Teacher teacher) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        session.persist(teacher);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public List<Teacher> getAllTeachers() {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Query query = session.createQuery("from Teacher a ");
        List<Teacher> teachers = (List<Teacher>) query.list();
        session.getTransaction().commit();
        session.close();

        return teachers;
    }

    @Override
    public Teacher getTeacherByName(String firstName) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Teacher teacher = (Teacher) session.get(Teacher.class,firstName);
        session.getTransaction().commit();
        session.close();
        return teacher;
    }
}
