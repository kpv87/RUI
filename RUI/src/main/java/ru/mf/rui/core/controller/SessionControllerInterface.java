/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mf.rui.core.controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author user
 */
public interface SessionControllerInterface {
    
    public Object getSession(HttpServletRequest req);
    
}
