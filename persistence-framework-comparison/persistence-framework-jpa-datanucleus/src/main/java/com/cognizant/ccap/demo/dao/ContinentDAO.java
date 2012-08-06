/**
 * 
 */
package com.cognizant.ccap.demo.dao;

import java.util.List;

import com.cognizant.ccap.demo.associations.Continent;

/**
 * @author 189833
 * 
 */
public interface ContinentDAO {

	Continent findOne(final Integer id);

	List<Continent> findAll();

	void save(final Continent entity);
	
	Continent saveOrUpdate(final Continent entity);

	Continent update(final Continent entity);

	void delete(final Continent entity);

	void deleteById(final Integer entityId);

}
