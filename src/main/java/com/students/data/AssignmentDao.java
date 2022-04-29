
package com.students.data;

import com.students.domain.Assignment;
import java.util.List;
import javax.persistence.Query;

public class AssignmentDao extends GenericDao{
    
        public List<Assignment> getAssignmentList(){
        
        String queryString = "SELECT a FROM Assignment a";
        em = this.getEntityManager();
        
        Query query = em.createQuery(queryString);
        
        return query.getResultList();

    }
    
    public Assignment getAssignment(Assignment assignment){
        
        em = this.getEntityManager();
        
        return em.find(Assignment.class, assignment.getAssignmentId());
        
    }
    
    public void insertAssignment(Assignment assignment){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.persist(assignment);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
    public void updateAssignment(Assignment assignment){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.merge(assignment);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
        
        
    public void deleteAssignment(Assignment assignment){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.remove(em.merge(assignment));
            
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