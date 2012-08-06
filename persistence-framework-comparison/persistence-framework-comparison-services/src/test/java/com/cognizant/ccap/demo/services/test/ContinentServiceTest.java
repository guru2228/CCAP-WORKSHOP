/**
 * 
 */
package com.cognizant.ccap.demo.services.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextLoader;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ccap.demo.associations.Continent;
import com.cognizant.ccap.demo.services.ContinentService;

/**
 * @author 189833
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" }, loader = ContextLoader.class)
@TransactionConfiguration(transactionManager = "transactionManager")
@Transactional
public class ContinentServiceTest {

	@Autowired
	private ContinentService service;

	@Test
	public void testContinentService() {
		try {
			System.out.println("Inside testContinentService");
			Continent continent = service.findContinentByID(3);
			System.out.println(continent);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
