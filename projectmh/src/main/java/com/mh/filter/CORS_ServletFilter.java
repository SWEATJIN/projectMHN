package com.mh.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mh.context.ServletContextHolder;

@WebFilter
public class CORS_ServletFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request_ = (HttpServletRequest)request;
		HttpServletResponse response_ = (HttpServletResponse)response;
		
		if(ServletContextHolder.getServletContext().getInitParameter("react_env").equals("development")) {
			response_.setHeader("Access-Control-Allow-Origin", request_.getHeader("Origin"));
	         response_.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, PATCH, OPTIONS");
	         response_.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	         response_.setHeader("Access-Control-Allow-Credentials", "true");
		}
		
	}
	
}
