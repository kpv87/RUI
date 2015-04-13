package ru.mf.rui.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//import ru.pavel.forum.core.entity.Users;

@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		System.out.println(uri);
		//if (uri.contains("post")) {
//			Users userData = (Users) request.getSession().getAttribute(
//					"personSession");
//			if (userData == null) {
		//		response.sendRedirect("login.do");
		//		return false;
//			} 
		//}
		return true;
	}
}