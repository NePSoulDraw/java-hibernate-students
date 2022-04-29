
package com.students.tests;

import com.students.data.*;
import java.util.List;

public class DaoTest {
    
    // Only for tests
    
    public static void main(String[] args) {
        
        /*
        StudentDao studentDao = new StudentDao();
        AddressDao addressDao = new AddressDao();
        ContactDao contactDao = new ContactDao();
        CourseDao courseDao = new CourseDao();
        AssignmentDao assignmentDao = new AssignmentDao();
        
        System.out.println("Students: ");
        print(studentDao.getStudentList());
        
        System.out.println("Addresses: ");
        print(addressDao.getAddressList());
        
        System.out.println("Contacts: ");
        print(contactDao.getContactList());
        
        System.out.println("Courses: ");
        print(courseDao.getCourseList());
        
        System.out.println("Assignments: ");
        print(assignmentDao.getAssignmentList());

        */
        
    }
    
    private static void print(List collection){
        
        for(Object o: collection){
            
            System.out.println("Value = " + o);
            
        }
        
    }

}
