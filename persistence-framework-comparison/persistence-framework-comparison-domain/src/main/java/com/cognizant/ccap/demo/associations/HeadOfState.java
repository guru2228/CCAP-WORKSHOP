package com.cognizant.ccap.demo.associations;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 189833
 * 
 */

@Entity
@Table(name = "HEAD_OF_STATE")
public class HeadOfState {

	@Id
	@GeneratedValue
	@Column(name = "HOS_ID")
	private Integer id;

	@Column(name = "HOS_NAME")
	private String name;

	@OneToOne
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	@ManyToMany
	@JoinTable(name = "VISIT", joinColumns = { @JoinColumn(name = "HOS_ID") }, inverseJoinColumns = { @JoinColumn(name = "COUNTRY_ID") })
	private Set<Country> visited;

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public Set<Country> getVisited() {
		return visited;
	}

	public void addVisit(Country country) {
		this.visited.add(country);
		country.getVisitors().add(this);
	}

}
