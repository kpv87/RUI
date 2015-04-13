/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.window.form;

import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 *
 * @author Zip
 */
public class RegistrationWindow extends WindowForm{

    public RegistrationWindow() {
        setCaption("Registration");
        
        final VerticalLayout content = new VerticalLayout();
        TextField usernameField = new TextField("username");
        usernameField.setCursorPosition(0);
        
        content.addComponent(usernameField);
        content.addComponent(new TextField("password"));
        
        Button loginButton = new Button("Login");
        loginButton.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                Notification.show("login");
                TextField loginField = (TextField)content.getComponent(0);
                System.err.println(loginField.getValue());
                close();
            }
        });
        
        content.addComponent(loginButton);
        addComponent(content);
    }
    
}
