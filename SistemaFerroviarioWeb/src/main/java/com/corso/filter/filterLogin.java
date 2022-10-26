package com.corso.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class filterLogin
 */
@WebFilter("/home/*")
public class filterLogin extends HttpFilter implements Filter {
	int numeroRichieste=0;
	
	
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		
//		numeroRichieste = numeroRichieste+1;
//		Enumeration<String> names = httpRequest.getHeaderNames();
		
		
//		while(names.hasMoreElements()) {
//			String name = names.nextElement();
//			System.out.println("Valore del Header: " + name + " " + httpRequest.getHeader(name));
//		}
		
//		System.out.println(numeroRichieste + httpRequest.);
		
		if(session.getAttribute("utente")!=null) {
			
			chain.doFilter(request, response);
		}
			
		else {
			String URL = "http://localhost:" + httpRequest.getLocalPort()+httpRequest.getContextPath()+"/loginPage";
			httpResponse.sendRedirect(URL);
		}
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
