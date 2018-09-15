package lti.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {
public void init(FilterConfig fConfig) throws ServletException{
	
	
}
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		System.out.println("Visit time: " + new Date());
		System.out.println("Visitor IP: " + request.getRemoteAddr());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		PrintWriter out = response.getWriter();
		out.println("<hr> <center>&copy;2020 LnT Infotech</center>");
	}
}
	