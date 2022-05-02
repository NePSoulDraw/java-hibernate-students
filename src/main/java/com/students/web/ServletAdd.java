
package com.students.web;

import com.students.domain.*;
import com.students.service.StudentService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletAdd")
public class ServletAdd extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String street = req.getParameter("street");
        String streetNumberString = req.getParameter("streetNumber");
        String country = req.getParameter("country");
        String email = req.getParameter("email");
        String phoneString = req.getParameter("phone");
        
        int phone = 0;
        int streetNumber = 0;
        
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
        student.setName(name);
        student.setSurname(surname);
        student.setAddress(address);
        student.setContact(contact);
        
        StudentService studentService = new StudentService();
        studentService.saveStudent(student);
        
        req.getRequestDispatcher("/index.jsp").forward(req, res);
        
    }
    
}
