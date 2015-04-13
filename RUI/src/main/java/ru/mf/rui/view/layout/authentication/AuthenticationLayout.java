/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.layout.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.mf.rui.core.controller.SpringContextHelper;
import ru.mf.rui.view.layout.LayoutInterface;
import ru.mf.rui.view.window.form.LoginWindow;

import com.vaadin.event.LayoutEvents;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Zip
 */
/*@Component
@Scope("prototype")*/
public class AuthenticationLayout extends VerticalLayout  {
    
    public AuthenticationLayout() {
    	VerticalLayout loginButton = new VerticalLayout(new Label("Login"));
        VerticalLayout registrationButton = new VerticalLayout(new Label("Registration"));
        addComponent(loginButton);
        addComponent(registrationButton);
        loginButton.addLayoutClickListener(new LayoutEvents.LayoutClickListener() {
            @Override
            public void layoutClick(LayoutEvents.LayoutClickEvent event) {
                UI.getCurrent().addWindow(new LoginWindow()/*(LoginWindow) contextHelper.getBean("loginWindow")*/);
            }
        });
    }
    
    
}
