/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view;

import ru.mf.rui.view.component.DashboardMenu;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Zip
 */

public class MainView extends HorizontalLayout {
//    private HorizontalLayout horizontalLayout;
//    private VerticalLayout verticalLayout;

    public MainView() {
        setSizeFull();
        addStyleName("mainview");

        addComponent(new DashboardMenu());
    
        ComponentContainer content = new CssLayout();
        content.addStyleName("view-content");
        content.setSizeFull();
        addComponent(content);
        setExpandRatio(content, 1.0f);

        new Navigator(UI.getCurrent(),content);
    }
    public void setHeader(VerticalLayout menuLayout){
        //TODO add head of site(picture) 
    }

    public void setAuthentication(VerticalLayout authenticationLayout){
        /*this.addComponent(authenticationLayout, "left: 90%; right: 0px" +
                                         "top: 2px; bottom: 90%");*/
    }
    
    public void setLeftMenu(VerticalLayout menuLayout){
        /*this.addComponent(menuLayout, "left: 1%; right: 80%;" +
                                        "top: 20%; bottom: 30%");*/ 
    }
    
}
