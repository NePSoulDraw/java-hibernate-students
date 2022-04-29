
package com.students.data;

import com.students.domain.Course;
import java.util.List;
import javax.persistence.Query;

public class CourseDao extends GenericDao{
    
        public List<Course> getCourseList(){
        
        String queryString = "SELECT c FROM Course c";
        em = this.getEntityManager();
        
        Query query = em.createQuery(queryString);
        
        return query.getResultList();

    }
    
    public Course getCourse(Course course){
        
        em = this.getEntityManager();
        
        return em.find(Course.class, course.getCourseId());
        
    }
    
    public void insertCourse(Course course){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.persist(course);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
    public void updateCourse(Course course){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.merge(course);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
        
        
    public void deleteCourse(Course course){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.remove(em.merge(course));
            
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