/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view;

import org.springframework.beans.factory.annotation.Autowired;

import ru.mf.rui.view.layout.BaseLayout;
import ru.mf.rui.view.layout.menu.LeftMenuLayout;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Zip
 */
/*@Component
@Scope("prototype")*/ 
public class StartPage extends BaseLayout implements View{

/*	@Autowired
	private AuthenticationLayout authenticationLayout;
	@Autowired
	private LeftMenuLayout leftMenuLayout;*/
	@Autowired
	private VerticalLayout authenticationLayout;
	@Autowired
	private VerticalLayout leftMenuLayout;
	
	public StartPage() {
    
    }
    
	public void setAuthenticationLayout(VerticalLayout authenticationLayout) {
		setAuthentication(authenticationLayout);
	}
	
	public void setLeftMenuLayout(VerticalLayout leftMenuLayout) {
		setLeftMenu(leftMenuLayout);
	}

	@Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    	
    //	setAuthentication(authenticationLayout);
    //    Notification.show("Welcome!");
    }
    
}
