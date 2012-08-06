package com.cognizant.ccap.demo.inheritance.type.three;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* 
*/
@Entity
@Table(name = "STUDENT")
public class Student extends Person {

    @Column(name = "BRANCH")
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}
