/**
 * 
 */
package com.cognizant.ccap.demo.services;

import com.cognizant.ccap.demo.associations.Continent;

/**
 * @author 189833
 * 
 */
public interface ContinentService {

	Continent findContinentByID(Integer id);

	void saveContinent(Continent continent);

}
