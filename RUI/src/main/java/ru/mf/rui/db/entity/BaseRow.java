package ru.mf.rui.db.entity;

import java.util.List;

public class BaseRow {
    List<Object> columnList;

    public List<Object> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Object> columnList) {
        this.columnList = columnList;
    }

    public void printRowToConsole() {
        for (Object value: columnList) {
            System.out.println();
            System.out.print(value+"\t");
        }
    }
}
