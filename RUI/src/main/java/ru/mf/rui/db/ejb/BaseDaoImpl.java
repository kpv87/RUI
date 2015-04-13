/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.db.ejb;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
//@Repository
public class BaseDaoImpl implements BaseDaoInterface {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public void addEntity(Object object) {
        this.sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public List<Object> getAllEntity(Object entity) {
        return this.sessionFactory.getCurrentSession().createCriteria(entity.getClass()).list();
    }

    @Override
    public void deleteEntity(Object entity, Integer entityId) {
        Object object = sessionFactory.getCurrentSession().load(
                entity.getClass(), entityId);
        if (null != object) {
            this.sessionFactory.getCurrentSession().delete(object);
        }
    }

    @Override
    public void editEntity(Object entity, Integer entityId) {
        Object object = sessionFactory.getCurrentSession().load(
                entity.getClass(), entityId);
        if (null != object) {
            this.sessionFactory.getCurrentSession().update(object);
        }
    }

//    @Override
//    public Object getEntityById(Object entity, Integer entityId) {
//        Criteria crit = this.sessionFactory.getCurrentSession().createCriteria(entity.getClass());
//        crit.add(Restrictions.eq("name", entityId));
//        crit.setMaxResults(1);
//        return null;
//    }
}
