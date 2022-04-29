
package com.students.data;

import com.students.domain.Address;
import java.util.List;
import javax.persistence.*;

public class AddressDao extends GenericDao{
    
    public List<Address> getAddressList(){
        
        String queryString = "SELECT d FROM Address d";
        em = this.getEntityManager();
        
        Query query = em.createQuery(queryString);
        
        return query.getResultList();

    }
    
    public Address getAddress(Address address){
        
        em = this.getEntityManager();
        
        return em.find(Address.class, address.getAddressId());
        
    }
    
    public void insertAddress(Address address){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.persist(address);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
    
    public void updateAddress(Address address){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.merge(address);
            
            em.getTransaction().commit();
            
        }catch(Exception ex){
            
            ex.printStackTrace(System.out);
            
        }finally{
            
            if(em != null){
                
                em.close();
                
            }
            
        }
        
    }
        
        
    public void deleteAddress(Address address){
        
        try{
            
            em = this.getEntityManager();
            
            em.getTransaction().begin();
            
            em.remove(em.merge(address));
            
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