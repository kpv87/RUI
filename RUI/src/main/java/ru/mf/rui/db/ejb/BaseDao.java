package ru.mf.rui.db.ejb;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.mf.rui.db.entity.BaseRow;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao implements BaseDaoInterface{
	private JdbcTemplate jdbcTemplate;
	private String sqlString;
	public BaseDao(JdbcTemplate jdbcTemplate, String sqlString) {
		this.jdbcTemplate = jdbcTemplate;
		this.sqlString = sqlString;
	}


	@Override
	public void addRow(Object entity) {
				
	}

	@Override
	public List<BaseRow> getRowList(Object entity) {
		List<BaseRow> baseRowList = this.jdbcTemplate.query(
				sqlString,
				new RowMapper<BaseRow>() {
					@Override
					public BaseRow mapRow(ResultSet rs, int rowNum) throws SQLException {
						ArrayList<Object> record = new ArrayList<>();
						ResultSetMetaData rsmd = rs.getMetaData();
						int columnCount = rsmd.getColumnCount();
						for (int i = 1; i <= columnCount; i++) {
							Object value = rs.getObject(i);
							record.add(value);
						}
						BaseRow baseRow = new BaseRow();
						baseRow.setColumnList(record);
						return baseRow;
					}
				});
		return baseRowList;
	}

	@Override
	public void deleteRow(Object entity, Integer entityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editRow(Object entity, Integer entityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BaseRow getNextRow() {

		return null;
	}

	@Override
	public int getPositionRow() {
		return 0;
	}

}
