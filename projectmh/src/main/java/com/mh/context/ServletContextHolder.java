package com.mh.context;

import javax.servlet.ServletContext;

public class ServletContextHolder {
	private static ServletContext context;
	
	private ServletContextHolder() {}

	public static void setServletContext(ServletContext servletContext) {
		context = servletContext;
	}
	
	public static ServletContext getServletContext() {
		return context;
	}
	
}
