/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.core.controller;

import javax.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author Zip
 */
public class SpringContextHelper {
    private ApplicationContext applicationContext;

    public SpringContextHelper(ServletContext servletContext) {
        applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
    }
    public Object getBean(final String beanRef){
        return applicationContext.getBean(beanRef);
    }
}
