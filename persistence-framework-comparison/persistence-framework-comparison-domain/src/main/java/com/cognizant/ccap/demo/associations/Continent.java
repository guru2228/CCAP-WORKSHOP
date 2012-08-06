package com.cognizant.ccap.demo.associations;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author 189833
 * 
 */

@Entity
@Table(name = "CONTINENT")
public class Continent {

	@Id
	@GeneratedValue
	@Column(name = "CONTINENT_ID")
	private Integer id;

	@Column(name = "CONTINENT_NAME")
	private String name;

	@OneToMany(mappedBy = "continent", cascade = { CascadeType.PERSIST,
			CascadeType.REMOVE })
	// @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	// @JoinColumn(name = "CONTINENT_ID")
	private Set<Country> countries;

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void addCountry(Country country) {
		country.setContinent(this);
		getCountries().add(country);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
