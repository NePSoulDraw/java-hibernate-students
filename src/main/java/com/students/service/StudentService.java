
package com.students.service;

import com.students.data.StudentDao;
import com.students.domain.Student;
import java.util.List;

public class StudentService {
    
    private StudentDao studentDao = new StudentDao();
    
    public List<Student> getAllStudents(){
        
        return studentDao.getStudentList();
        
    }
    
    public Student getStudent(Student student){
        
        return studentDao.getStudent(student);
        
    }
    
    public void saveStudent(Student student){
        
        if(student != null && student.getStudentId() == null){
            
            studentDao.insertStudent(student);
            
        }else{
            
            studentDao.updateStudent(student);
            
        }
        
    }
    
    public void deleteStudent(Student student){
        
        studentDao.deleteStudent(student);
        
    }
    
}
