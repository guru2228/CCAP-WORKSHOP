package com.cognizant.ccap.demo.inheritance.type.two;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* 
*/
@Entity
@DiscriminatorValue("STUDENT")
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
