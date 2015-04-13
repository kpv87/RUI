package ru.mf.rui.view.layout.menu;

import org.springframework.stereotype.Component;

import com.vaadin.ui.Accordion;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@Component
public class LeftMenuLayout extends VerticalLayout{
	Accordion accordion = new Accordion();
	
	final Label selection = new Label("-");
	//main.addComponent(selection);
	MenuBar.Command commandMenu = new MenuBar.Command() {
	    public void menuSelected(MenuItem selectedItem) {
	        selection.setValue("Ordered a " +
	                           selectedItem.getText() +
	                           " from menu.");
	    }  
	};
	
	public LeftMenuLayout() {
		Panel panel = new Panel("Functions");
		
		MenuBar menuBar = new MenuBar();
		menuBar.addItem("test 1", commandMenu);
		panel.setContent(menuBar);
		
		addComponent(panel);
		addComponent(selection);
	}
}
