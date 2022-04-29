
package com.students.data;

import com.students.domain.Student;
import java.util.List;
import javax.persistence.Query;

public class StudentDao extends GenericDao{
    
        public List<Student> getStudentList(){
        
        String queryString = "SELECT s FROM Student s";
        em = this.getEntityManager();
        
        Query query = em.createQuery(queryString);
        
        return query.getResultList();

    }
    
    public Student getStudent(Student student){
        
        em = this.getEntityManager();
        
        return em.find(Student.class, student.getStudentId());
        
    }
    
    public void insertStudent(Student student){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.persist(student);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
    public void updateStudent(Student student){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.merge(student);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
        
        
    public void deleteStudent(Student student){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.remove(em.merge(student));
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
}