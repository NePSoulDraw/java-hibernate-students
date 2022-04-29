
package com.students.data;

import com.students.domain.Contact;
import java.util.List;
import javax.persistence.Query;

public class ContactDao extends GenericDao{
    
        public List<Contact> getContactList(){
        
        String queryString = "SELECT c FROM Contact c";
        em = this.getEntityManager();
        
        Query query = em.createQuery(queryString);
        
        return query.getResultList();

    }
    
    public Contact getContact(Contact contact){
        
        em = this.getEntityManager();
        
        return em.find(Contact.class, contact.getContactId());
        
    }
    
    public void insertContact(Contact contact){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.persist(contact);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
    public void updateContact(Contact contact){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.merge(contact);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
        
        
    public void deleteContact(Contact contact){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.remove(em.merge(contact));
            
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