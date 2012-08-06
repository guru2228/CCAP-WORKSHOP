/**
 * 
 */
package com.cognizant.ccap.demo.dao;

import org.springframework.stereotype.Repository;

import com.cognizant.ccap.demo.associations.Continent;

/**
 * @author 189833
 * 
 */
@Repository
public class ContinentDaoImpl extends AbstractJpaDAO<Continent, Integer>
		implements ContinentDAO {

	public Continent saveOrUpdate(Continent continent) {
		if (continent.getId() != null) {
			return update(continent);
		} else {
			save(continent);
		}
		return continent;
	}

}
