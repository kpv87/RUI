/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.db.ejb;

import ru.mf.rui.db.entity.BaseRow;

import java.util.List;

/**
 *
 * @author user
 */
public interface BaseDaoInterface {

    public void addRow(Object entity);

    public List<BaseRow> getRowList(Object entity);

    public void deleteRow(Object entity, Integer entityId);

    public void editRow(Object entity, Integer entityId);

    public BaseRow getNextRow();

    public int getPositionRow();
    
 //   public Object getEntityById(Object entity, Integer entityId);
}
