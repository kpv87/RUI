/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.window.form;

import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Component;
import com.vaadin.ui.Window;

/**
 *
 * @author Zip
 */
public class WindowForm extends Window{

    public WindowForm() {
        center();
        setModal(true);
        setCloseShortcut(ShortcutAction.KeyCode.ESCAPE);
    }
    
    public void addComponent(Component component) {
        setContent(component);
    }
}
