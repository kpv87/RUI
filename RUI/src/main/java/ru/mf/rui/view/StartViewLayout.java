/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view;

import org.springframework.beans.factory.annotation.Autowired;

import ru.mf.rui.view.event.ApplicationEvent.CloseOpenWindowsEvent;

import com.vaadin.event.LayoutEvents.LayoutClickEvent;
import com.vaadin.event.LayoutEvents.LayoutClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Responsive;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Zip
 */
/*@Component
@Scope("prototype")*/ 
public class StartViewLayout extends Panel implements View{

    public static final String EDIT_ID = "dashboard-edit";
    public static final String TITLE_ID = "dashboard-title";

    private Label titleLabel;
    private CssLayout dashboardPanels;
    private Window notificationsWindow;
  // private final VerticalLayout root;
	
	public StartViewLayout() {
/*		addStyleName(ValoTheme.PANEL_BORDERLESS);
        setSizeFull();
        //DashboardEventBus.register(this);

        root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);
        root.addStyleName("dashboard-view");
        setContent(root);
        Responsive.makeResponsive(root);

    //    root.addComponent(buildHeader());

    //    root.addComponent(buildSparklines());

    //    Component content = buildContent();
        root.addComponent(content);
        root.setExpandRatio(content, 1);

        // All the open sub-windows should be closed whenever the root layout
        // gets clicked.
        root.addLayoutClickListener(new LayoutClickListener() {
            @Override
            public void layoutClick(final LayoutClickEvent event) {
               // DashboardEventBus.post(new CloseOpenWindowsEvent());
            }
        });*/
    }
    
	@Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    	
        Notification.show("Start Page");
    }
    
}
