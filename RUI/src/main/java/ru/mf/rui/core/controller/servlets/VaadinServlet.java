/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.core.controller.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ru.mf.rui.view.ApplicationUI;

import com.vaadin.annotations.VaadinServletConfiguration;

/**
 *
 * @author Zip
 */
/*@Controller
@RequestMapping("/*")*/
@WebServlet(urlPatterns = "/*")
@VaadinServletConfiguration(ui = ApplicationUI.class, productionMode = false)
@SessionAttributes("thought")  
public class VaadinServlet extends com.vaadin.server.VaadinServlet {
   
   ApplicationContext applicationContext = null;
 
   @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		if (applicationContext == null){
	           System.out.println("setting context in get");
	           applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
	       }
	}

   public ApplicationContext getApplicationContext() {
	   return applicationContext;
   }   
}