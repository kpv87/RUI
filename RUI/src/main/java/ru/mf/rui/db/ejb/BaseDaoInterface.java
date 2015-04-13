/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.db.ejb;

import java.util.List;

/**
 *
 * @author user
 */
public interface BaseDaoInterface {

    public void addEntity(Object employee);

    public List<Object> getAllEntity(Object entity);

    public void deleteEntity(Object entity, Integer entityId);

    public void editEntity(Object entity, Integer entityId);
    
 //   public Object getEntityById(Object entity, Integer entityId);
}
