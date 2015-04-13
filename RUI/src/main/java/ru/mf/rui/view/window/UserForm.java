/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.window;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Window;
import ru.mf.rui.db.entity.User;

/**
 *
 * @author Zip
 */
public class UserForm extends Window implements Button.ClickListener{
    
    private FormLayout editorForm = new FormLayout();
    private BeanFieldGroup<User> binder = new BeanFieldGroup<User>(User.class);
    
    public UserForm() {
        
        editorForm.addComponent(binder.buildAndBind("Name", "username"));
        binder.setBuffered(true);
        this.setContent(editorForm);
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
