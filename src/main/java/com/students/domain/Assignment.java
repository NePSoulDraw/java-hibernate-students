
package com.students.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Assignment implements Serializable{
    
    private static final long SERIAL_VERSION_UID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Integer assignmentId;
    
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;
    
    @Column(name = "time")
    private String time;

    public Assignment() {
        
    }

    public Assignment(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Assignment(String time) {
        this.time = time;
    }

    public Assignment(Integer assignmentId, String time) {
        this.assignmentId = assignmentId;
        this.time = time;
    }

    public Assignment(Integer assignmentId, Student student, Course course, String time) {
        this.assignmentId = assignmentId;
        this.student = student;
        this.course = course;
        this.time = time;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Assignment{" + "assignmentId=" + assignmentId + ", student=" + student + ", course=" + course + ", time=" + time + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.assignmentId);
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
        final Assignment other = (Assignment) obj;
        if (!Objects.equals(this.assignmentId, other.assignmentId)) {
            return false;
        }
        return true;
    }
    
}