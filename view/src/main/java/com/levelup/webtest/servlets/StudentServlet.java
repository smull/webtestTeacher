package com.levelup.webtest.servlets;

import com.levelup.model.Student;
import com.levelup.model.Teacher;
import com.levelup.service.StudentService;
import com.levelup.service.impl.StudentServiceImpl;
import com.levelup.webtest.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by SMULL on 26.02.2015.
 */
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = getStudent(request);
        StudentService studentService = new StudentServiceImpl();
        studentService.createStudent(student);

        request.getSession().setAttribute("objectId", student.getId());
        response.sendRedirect("success.jsp");
    }

    private Student getStudent(HttpServletRequest request){
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.setName(request.getParameter("name"));
        student.setGroup(request.getParameter("group"));

        teacher.setFirstName(request.getParameter("firstName"));
        teacher.setLastName(request.getParameter("lastName"));

        student.setTeacher(teacher);
        return student;
    }
}
