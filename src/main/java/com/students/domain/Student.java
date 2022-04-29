
package com.students.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Student implements Serializable{
    
    private static final long SERIAL_VERSION_UID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    private Contact contact;
    
    @OneToMany(mappedBy = "student")
    private List<Assignment> assignments;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "surname")
    private String surname;

    public Student() {
        
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(Address address, Contact contact, List<Assignment> assignments, String name, String surname) {
        this.address = address;
        this.contact = contact;
        this.assignments = assignments;
        this.name = name;
        this.surname = surname;
    }
    
    public Student(Integer studentId, String name, String surname) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
    }
    
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", address=" + address + ", contact=" + contact + ", name=" + name + ", surname=" + surname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.studentId);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }

}
