package ru.mf.rui.view;

/*import com.vaadin.demo.dashboard.view.dashboard.DashboardView;
import com.vaadin.demo.dashboard.view.reports.ReportsView;
import com.vaadin.demo.dashboard.view.sales.SalesView;
import com.vaadin.demo.dashboard.view.schedule.ScheduleView;
import com.vaadin.demo.dashboard.view.transactions.TransactionsView;*/
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;

public enum ApplicationViewType {
	
	START	("start", StartViewLayout.class, FontAwesome.HOME, true),
	REPORTS	("reports", ReportsViewLayout.class, FontAwesome.BAR_CHART_O, false);
	

	private final String viewName;
	private final Class<? extends View> viewClass;
	private final Resource icon;
	private final boolean stateful;

	private ApplicationViewType(final String viewName,
			final Class<? extends View> viewClass, final Resource icon,
			final boolean stateful) {
		this.viewName = viewName;
		this.viewClass = viewClass;
		this.icon = icon;
		this.stateful = stateful;
	}

	public boolean isStateful() {
		return stateful;
	}

	public String getViewName() {
		return viewName;
	}

	public Class<? extends View> getViewClass() {
		return viewClass;
	}

	public Resource getIcon() {
		return icon;
	}

	public static ApplicationViewType getByViewName(final String viewName) {
		ApplicationViewType result = null;
		for (ApplicationViewType viewType : values()) {
			if (viewType.getViewName().equals(viewName)) {
				result = viewType;
				break;
			}
		}
		return result;
	}

}
