package ru.mf.rui.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class JdbcCorporateEventDao {

	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public JdbcCorporateEventDao() {
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbctemplate() {
		return this.jdbcTemplate;
	}

}