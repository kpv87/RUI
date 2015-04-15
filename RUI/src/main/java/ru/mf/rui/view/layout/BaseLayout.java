/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view.layout;

import ru.mf.rui.view.component.DashboardMenu;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Zip
 */

public class BaseLayout extends AbsoluteLayout {
//    private HorizontalLayout horizontalLayout;
//    private VerticalLayout verticalLayout;

    public BaseLayout() {
        setSizeFull();
        addStyleName("baselayout");

        addComponent(new DashboardMenu());
    
    }
    public void setHeader(VerticalLayout menuLayout){
        //TODO add head of site(picture) 
    }

    public void setAuthentication(VerticalLayout authenticationLayout){
        this.addComponent(authenticationLayout, "left: 90%; right: 0px" +
                                         "top: 2px; bottom: 90%");
    }
    
    public void setLeftMenu(VerticalLayout menuLayout){
        this.addComponent(menuLayout, "left: 1%; right: 80%;" +
                                        "top: 20%; bottom: 30%"); 
    }
    
}
