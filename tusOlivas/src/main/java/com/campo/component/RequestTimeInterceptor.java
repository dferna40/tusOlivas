package com.campo.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{
	
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

	//Se ejecuta antes de entrar en el controlador -- Primero
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("StartTime", System.currentTimeMillis());
		return true;
	}
	
	//Se ejecuta justo antes del return y de devolver la vista -- Segundo
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		long startTime =(long) request.getAttribute("StartTime");
		LOG.info("--REQUEST URL: " + request.getRequestURL().toString() + "'-- TOTAL TIME: '" + (System.currentTimeMillis() - startTime )+ "'ms");
	}

	

	
}
