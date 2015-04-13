package ru.mf.rui.core.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ru.mf.rui.core.controller.servlets.VaadinServlet;

import com.vaadin.server.DefaultUIProvider;
import com.vaadin.server.UICreateEvent;
import com.vaadin.ui.UI;

public class SpringUIProvider extends DefaultUIProvider {

    @Override
    public UI createInstance(UICreateEvent event) {
        ApplicationContext ctx =  WebApplicationContextUtils
             .getWebApplicationContext(VaadinServlet.getCurrent().getServletContext());

        return ctx.getBean(event.getUIClass());
    }
}