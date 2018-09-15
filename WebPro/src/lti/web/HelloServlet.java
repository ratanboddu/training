package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private int visitor;
	@Override
	public void init() throws ServletException {
		visitor=1001;
		
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Response MIME type
		response.setContentType("text/html");
		
		//Getting response stream to write generated HTML output
		PrintWriter out=response.getWriter();
		
		//Writing HTML to response stream
		out.println("<h1>Hello World</h1><hr>");
		out.println("<h2>Welcome to Java Servlet</h2>");
		
		//Getting servlet config object
		ServletConfig config = getServletConfig();
		//Reding init-param from config
		String author = config.getInitParameter("Author");
		out.println("<h1> Author: "+author+"</h1>");
		out.println("<h2>Servlet Name: "+ config.getServletName()+"</h2>");
		
		LocalDate now= LocalDate.now();
		out.println("<h2> Visit Date: "+now+"</h2>");

		out.println("<h2> Visitor No: "+ visitor++ +"</h2>");
		
	}

}
