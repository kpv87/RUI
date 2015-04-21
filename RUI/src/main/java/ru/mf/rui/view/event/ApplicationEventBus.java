package ru.mf.rui.view.event;

import ru.mf.rui.view.ApplicationUI;

import com.google.gwt.thirdparty.guava.common.eventbus.EventBus;
import com.google.gwt.thirdparty.guava.common.eventbus.SubscriberExceptionContext;
import com.google.gwt.thirdparty.guava.common.eventbus.SubscriberExceptionHandler;


/**
 * A simple wrapper for Guava event bus. Defines static convenience methods for
 * relevant actions.
 */
public class ApplicationEventBus implements SubscriberExceptionHandler {

    private final EventBus eventBus = new EventBus(this);

    public static void post(final Object event) {
    	ApplicationUI.getDashboardEventbus().eventBus.post(event);
    }

    public static void register(final Object object) {
    	ApplicationUI.getDashboardEventbus().eventBus.register(object);
    }

    public static void unregister(final Object object) {
    	ApplicationUI.getDashboardEventbus().eventBus.unregister(object);
    }

    @Override
    public final void handleException(final Throwable exception,
            final SubscriberExceptionContext context) {
        exception.printStackTrace();
    }
}
