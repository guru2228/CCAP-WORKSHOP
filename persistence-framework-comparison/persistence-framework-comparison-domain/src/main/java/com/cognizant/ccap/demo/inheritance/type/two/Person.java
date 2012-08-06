package com.cognizant.ccap.demo.inheritance.type.two;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * Example for Joined, Multiple Table Inheritance or Table per class
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "PERSON_TYPE")
@Table(name = "PERSON")
public abstract class Person {

    /**
    *
    */
    @Id
    @GeneratedValue
    private Long   id;

    /**
     *
     */
    @Column(name = "PERSON_NAME")
    private String name;

    /**
     *
     */
    @Column(name = "PERSON_TYPE", insertable = false, updatable = false)
    private String personType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

}
