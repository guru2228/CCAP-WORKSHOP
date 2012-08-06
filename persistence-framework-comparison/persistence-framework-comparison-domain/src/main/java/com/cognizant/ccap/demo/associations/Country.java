package com.cognizant.ccap.demo.associations;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author 189833
 * 
 */

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private Integer id;

	@Column(name = "COUNTRY_NAME")
	private String name;

	private int area;

	@Transient
	private int rank;

	@ManyToOne
	@JoinColumn(name = "CONTINENT_ID")
	private Continent continent;

	@OneToOne(mappedBy = "country")
	// @JoinColumn(name = "COUNTRY_ID")
	private HeadOfState headOfState;

	@ManyToMany(mappedBy = "visited")
	private Set<HeadOfState> visitors;

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public void setHeadOfState(HeadOfState headOfState) {
		this.headOfState = headOfState;
	}

	public HeadOfState getHeadOfState() {
		return headOfState;
	}

	public Set<HeadOfState> getVisitors() {
		return visitors;
	}

	public void addHeadOfState(HeadOfState headOfState) {
		headOfState.setCountry(this);
		setHeadOfState(headOfState);
	}

}
