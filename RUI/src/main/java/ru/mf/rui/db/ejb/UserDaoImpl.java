/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.db.ejb;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ru.mf.rui.db.entity.User;

/**
 *
 * @author user
 */
//@Repository
public class UserDaoImpl extends BaseDaoImpl {

    public UserDaoImpl() {
    }
    

    public User getUserByPassword(User user) {
        Criteria crit = super.sessionFactory.getCurrentSession().createCriteria(User.class);
        crit.add(Restrictions.eq("username", user.getUsername()));
        crit.add(Restrictions.eq("password", user.getPassword()));
        crit.setMaxResults(1);
        if (crit.list().size() == 0) {
            return null;
        } else {
            return (User) crit.list().get(0);
        }
    }
}
