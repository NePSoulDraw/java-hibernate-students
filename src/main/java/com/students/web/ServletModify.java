
package com.students.web;

import com.students.domain.*;
import com.students.service.StudentService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletModify")
public class ServletModify extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        StudentService studentService = new StudentService();
        Student student = new Student();
        
        String studentIdString = req.getParameter("studentId");
        int studentId = 0;
        studentId = Integer.parseInt(studentIdString);
        
        student.setStudentId(studentId);
        Student studentToModify = studentService.getStudent(student);

        req.setAttribute("student", studentToModify);
        
        req.getRequestDispatcher("/WEB-INF/modifyStudent.jsp").forward(req, res);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        StudentService studentService = new StudentService();
         
        String modify = req.getParameter("modify");
        
        if (modify != null){
            
            String studentIdString = req.getParameter("studentId");
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            String street = req.getParameter("street");
            String streetNumberString = req.getParameter("streetNumber");
            String country = req.getParameter("country");
            String email = req.getParameter("email");
            String phoneString = req.getParameter("phone");

            int studentId = 0;
            int phone = 0;
            int streetNumber = 0;

            if(studentIdString != null && !"".equals(studentIdString)){

                studentId = Integer.parseInt(studentIdString);

            }

            if(phoneString != null && !"".equals(phoneString)){

                phone = Integer.parseInt(phoneString);

            }

            if(streetNumberString != null && !"".equals(streetNumberString)){

                streetNumber = Integer.parseInt(streetNumberString);

            }

            Address address = new Address();
            address.setStreet(street);
            address.setStreetNumber(streetNumber);
            address.setCountry(country);

            Contact contact = new Contact();
            contact.setEmail(email);
            contact.setPhone(phone);

            Student student = new Student();
            student.setStudentId(studentId);
            student.setName(name);
            student.setSurname(surname);
            student.setAddress(address);
            student.setContact(contact);

            studentService.saveStudent(student);

        }else{
            
            String studentIdString = req.getParameter("studentId");
            int studentId = 0;
            
            if(studentIdString != null && !"".equals(studentIdString)){

                studentId = Integer.parseInt(studentIdString);

            }
            
            Student student = new Student(studentId);
            
            Student studentForDelete = studentService.getStudent(student);
            
            studentService.deleteStudent(studentForDelete);
            
        }
        
        req.getRequestDispatcher("/index.jsp").forward(req, res);
        
    }
    
}
