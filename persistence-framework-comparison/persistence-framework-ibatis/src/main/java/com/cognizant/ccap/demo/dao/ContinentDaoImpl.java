/**
 * 
 */
package com.cognizant.ccap.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.cognizant.ccap.demo.associations.Continent;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author 189833
 * 
 */
public class ContinentDaoImpl implements ContinentDAO {

	private SqlMapClient sqlMapClient;

	public Continent findOne(Integer id) {
		try {
			return (Continent) sqlMapClient.queryForObject(
					"Continent.getContinent", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Continent> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Continent entity) {
		// TODO Auto-generated method stub

	}

	public Continent saveOrUpdate(Continent entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Continent update(Continent entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Continent entity) {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer entityId) {
		// TODO Auto-generated method stub

	}

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

}
