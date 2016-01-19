package ru.mf.rui.db.entity;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseTable {

    private ResultSet resultSet;
    private List<String> columnNames;
    private int columnCount;

    public BaseTable(ResultSet resultSet) {
        this.resultSet = resultSet;
        this.columnNames = new ArrayList<>();
        try{
            ResultSetMetaData rsmd = resultSet.getMetaData();
            columnCount = rsmd.getColumnCount();
            for (int columnNumber = 1; columnNumber < columnCount; columnNumber++) {
                columnNames.add(rsmd.getColumnName(columnNumber));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //TODO ResutSet.TYPE_SCROLL_INSENSITIVE
    public  int getRowCount()throws Exception
    {
        int result = 0;
        resultSet.last();
        result = resultSet.getRow();
        resultSet.beforeFirst();
        return result;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }
}
