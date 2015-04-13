package ru.mf.rui.db.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcCorporateEventDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public JdbcCorporateEventDao() {
	}

	public String getSityName(int num) {
		System.out.println("=1=");
		/*System.out.println("jdbcTemplate = "+jdbcTemplate);
		System.out.println("dataSource = "+dataSource);
		System.out.println("dataSource = "+dataSource);*/
		return "good";
//				this.jdbcTemplate.queryForObject(
//				"select name from bis.Branches where brnc_id = ?",
//				String.class, num);
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	
	
	
	
	// JDBC-backed implementations of the methods on the CorporateEventDao
	// follow...
}