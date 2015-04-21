/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.db.service;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
//import ru.mf.rui.ejb.UserDaoImpl;
import ru.mf.rui.db.ejb.BaseDaoInterface;


/**
 *
 * @author user
 */
//@Service
//@Configurable
public class ManageUsers {
   // User user = new User();
    
    @Autowired
   // @Qualifier("usersDaoImpl")
   // @Resource(name = "usersDaoImpl")
    private BaseDaoInterface userDaoImpl;

//    @PostConstruct
//    public void init(){
//        userDaoImpl.getAllEntity(user);
//    }
    
    //private UserDaoImpl userDAO;
//    public void init(){
//        listUser();
//    }
    
//    public ManageUsers() {
//        listUser();
//    }

/*    @Transactional
    public void addUser(User user) {
        userDaoImpl.addEntity(user);
    }

    @Transactional
    public List<Object> listUser() {
       // Users user = new Users();
        return userDaoImpl.getAllEntity(user);
    }
    
    @Transactional
    public void deleteUser(int userId) {
        userDaoImpl.deleteEntity(user, userId);
    }*/
//    
//    @Transactional
//    public User getUserByPassword(User user) {
//        return userDAO.getUserByPassword(user);
//    }

    

}
