
package com.students.web;

import com.students.domain.Student;
import com.students.service.StudentService;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {

        StudentService studentService = new StudentService();

        List<Student> students = studentService.getAllStudents();
        
        req.setAttribute("students", students);
        
        req.getRequestDispatcher("/WEB-INF/studentList.jsp").forward(req, res);

    }
    
}
