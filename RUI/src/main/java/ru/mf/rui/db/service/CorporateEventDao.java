package ru.mf.rui.db.service;

import javax.sql.DataSource;

public interface CorporateEventDao {
	public void setDataSource(DataSource dataSource);
	public String getSityName(int num);
}
