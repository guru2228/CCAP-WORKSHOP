package com.cognizant.ccap.demo.inheritance.type.three;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* 
*/
@Entity
@Table(name = "TEACHER")
public class Teacher extends Person {

    @Column(name = "DEPT")
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}