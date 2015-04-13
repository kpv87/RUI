/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.window.form;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import ru.mf.rui.db.service.JdbcCorporateEventDao;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * @author Zip
 */
@Component
public class LoginWindow extends WindowForm {
	
	
	private JdbcCorporateEventDao jdbcCorporateEventDao;
	
	@Resource(name="jdbcCorporateEventDao")
	public void setJdbcCorporateEventDao(JdbcCorporateEventDao jdbcCorporateEventDao) {
		this.jdbcCorporateEventDao = jdbcCorporateEventDao;
	}

	
	public LoginWindow() {
		
		setCaption("Login");
		System.err.println("--------------------");
		System.err.println(jdbcCorporateEventDao);
		System.err.println("--------------------");
		final VerticalLayout content = new VerticalLayout();
		final TextField usernameField = new TextField("username");
		usernameField.setCursorPosition(0);
		content.addComponent(usernameField);
		content.addComponent(new TextField("password"));

		Button loginButton = new Button("Login");
		loginButton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(Button.ClickEvent event) {
				Notification.show("login");
				TextField loginField = (TextField) content.getComponent(0);
				System.err.println(jdbcCorporateEventDao);

				//System.out.println(jdbcCorporateEventDao.getSityName(Integer.parseInt(loginField.getValue())));
				close();
			}
		});

		content.addComponent(loginButton);
		addComponent(content);
	}

}
