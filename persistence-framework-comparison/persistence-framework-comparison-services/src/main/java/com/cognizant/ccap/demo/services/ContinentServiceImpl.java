/**
 * 
 */
package com.cognizant.ccap.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ccap.demo.associations.Continent;
import com.cognizant.ccap.demo.dao.ContinentDAO;

/**
 * @author 189833
 *
 */
@Service
//@Transactional(readOnly=true)
public class ContinentServiceImpl implements ContinentService {

	@Autowired
	private ContinentDAO continentDao;
	
	
	public Continent findContinentByID(Integer id){
		return continentDao.findOne(id);
	}
	
	@Transactional
	public void saveContinent(Continent continent){
		continentDao.save(continent);
	}
}
