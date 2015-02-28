package com.levelup.dao.impl;

import com.levelup.dao.HibernateSessionProvider;
import com.levelup.model.Student;
import com.levelup.model.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by SMULL on 26.02.2015.
 */
public class StudentRepositoryImpl implements com.levelup.dao.StudentRepository {

    public StudentRepositoryImpl() {
    }

    @Override
    public void createStudent(Student student) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        //Teacher teacher = (Teacher) session.get(Teacher.class, student.getTeacher().getId());
        //student.setTeacher(teacher);
        session.persist(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateStudent(Student student) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Student sourceStudent = (Student) session.get(Student.class, student.getId());
        sourceStudent.setName(student.getName());
        sourceStudent.setGroup(sourceStudent.getGroup());
        sourceStudent.setTeacher(student.getTeacher());
        session.merge(sourceStudent);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        student = (Student) session.get(Student.class, student.getId());
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> getAllStudentsByTeacherId(Long id) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Query query = session.createQuery("from Student as s where s.teacher.id = :id");
        query.setParameter("id",id);
        List<Student> result = query.list();
        return result;
    }

    @Override
    public List<Student> getAllStudentsByName(String firstName, String lastName) {
        Session session = HibernateSessionProvider.getSession();
        session.beginTransaction();
        Query query = session.createQuery("from Student as s where s.teachet.firstName like :firstName " +
                "and s.teacher.lastName like :lastName");
        query.setParameter("firstName",firstName+"%");
        query.setParameter("lastName",lastName+"%");
        List<Student> result = query.list();
        return result;
    }
}
