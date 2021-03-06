/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mf.rui.view;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import ru.mf.rui.core.controller.SpringContextHelper;
import ru.mf.rui.db.service.JdbcCorporateEventDao;
import ru.mf.rui.view.event.ApplicationEventBus;
import ru.mf.rui.view.MainView;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author Zip
 */
@Component
@Scope("prototype") // создается объект по запросу (не синглтон)
@Theme("dashboard")
public class ApplicationUI extends UI {

    private Navigator navigator;
    protected static final String STARTPAGE = "startPage";
    private final ApplicationEventBus applicationEventBus = new ApplicationEventBus();
    
 
    private JdbcCorporateEventDao jdbcCorporateEventDao;
/*    @Autowired
    private StartViewLayout startPage;*/
	
	@Resource(name="jdbcCorporateEventDao")
	public void setJdbcCorporateEventDao(JdbcCorporateEventDao jdbcCorporateEventDao) {
		this.jdbcCorporateEventDao = jdbcCorporateEventDao;
	}
	
//	private String[] themes = { "valo", "reindeer", "runo", "chameleon" };
    
    @Override
    protected void init(VaadinRequest request) {
    	
        getPage().setTitle("Main window");
        setLocale(Locale.US);

        ApplicationEventBus.register(this);
        Responsive.makeResponsive(this);
        addStyleName(ValoTheme.UI_WITH_MENU);
        
        setContent(new MainView());
       // removeStyleName("loginview");
        getNavigator().addView(STARTPAGE, StartViewLayout.class);
        getNavigator().navigateTo(STARTPAGE); 
        
        
        //register views
/*        navigator.addView(STARTPAGE, startPage);
        navigator.navigateTo(STARTPAGE);*/
        
   //     System.out.println("in mainUI = "+contextHelper.getBean("jdbcCorporateEventDao"));
//        
//        HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
//        setContent(horizontalSplitPanel);
//        Button button = new Button("test",new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent event) {
//                addWindow(new UserForm());
//            }
//        });
//        horizontalSplitPanel.addComponent(button);
//        System.out.println("T 1");
//        System.out.println(managesUsers.listUser().size());
//        List<User> listUser = (List)managesUsers.listUser();
//        System.out.println(listUser.size());
//        User user = (User)listUser.get(0);
//        
//        //horizontalSplitPanel.addComponent(new Button(user.getEmail()));   
//        BeanItemContainer<User> userContainer = new BeanItemContainer(User.class);
//        userContainer.addAll(listUser);
//        Table users = new Table("Users", userContainer);
//        horizontalSplitPanel.addComponent(users);
//                
                //   MTable<User> table = new Table<User>();

    }
    
/*    public static DataProvider getDataProvider() {
        return ((DashboardUI) getCurrent()).dataProvider;
    }*/
    
    public static ApplicationEventBus getDashboardEventbus() {
        return ((ApplicationUI) getCurrent()).applicationEventBus;
    }
    
}
