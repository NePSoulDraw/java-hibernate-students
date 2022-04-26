
package com.students.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Contact implements Serializable{
    
    private static final long SERIAL_VERSION_UID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId;
    
    @Column(name = "phone")
    private int phone;
    
    @Column(name = "email")
    private String email;

    public Contact() {
        
    }

    public Contact(Integer contactId) {
        this.contactId = contactId;
    }

    public Contact(int phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public Contact(Integer contactId, int phone, String email) {
        this.contactId = contactId;
        this.phone = phone;
        this.email = email;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "contactId=" + contactId + ", phone=" + phone + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.contactId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.contactId, other.contactId)) {
            return false;
        }
        return true;
    }
    
}
