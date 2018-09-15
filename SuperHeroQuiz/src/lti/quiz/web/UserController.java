package lti.quiz.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.OptionBean;
import lti.quiz.bean.RegisterBean;
import lti.quiz.service.UerServiceImpl;
import lti.quiz.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user.quiz")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UerServiceImpl service;
	
	

	@Override
	public void init() throws ServletException {
		service = new UerServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer = request.getHeader("referer");
		// Creates a fresh new session in the server if no
		//session id found in request header
		//Otherwise old session identified by id in request header
		HttpSession session = request.getSession();
		
		if(request.getParameter("logout")!=null) {
			//user request to logout
			session.invalidate();//destroying session
			response.sendRedirect("index.jsp");
		}
		
		else if(referer.contains("index")) {
			//Request is for login authentication
			LoginBean login=new LoginBean();
			String paramEmail=request.getParameter("email");
			String paramPass=request.getParameter("password");
			login.setEmail(paramEmail);
			login.setPassword(paramPass);
			RegisterBean user=service.authenticate(login);
			if(user!=null)
			{
				//Login sussessful
				session.setAttribute("USER", user);
				response.sendRedirect("dashboard.jsp");
			}
			else
			{
				//Login failed
				response.sendRedirect("index.jsp?invalid=yes");
			}
			
			
		}else if(referer.contains("register")) {
			//Request is for new user registration
			RegisterBean register = new RegisterBean();
			String paramEmail=request.getParameter("email");
			String paramPass=request.getParameter("password");
			String paramSuperHero=request.getParameter("superhero");
			
			register.setEmail(paramEmail);
			register.setPassword(paramPass);
			register.setAnswer(paramSuperHero);
			if(service.register(register))
			response.sendRedirect("index.jsp");
			else
				response.sendRedirect("register.jsp");
		}
		else if(referer.contains("forget")) {
			//Request to validate user
			ForgetBean forget = new ForgetBean();
			String paramEmail=request.getParameter("email");
			String paramSuperHero=request.getParameter("superhero");
			
			forget.setEmail(paramEmail);
			forget.setAnswer(paramSuperHero);
			
			if(service.validate(forget)) {
			session.setAttribute("Email", forget.getEmail());
			response.sendRedirect("change.jsp");
			}else {
				response.sendRedirect("forget.jsp");
			}
			
			
		}
		
		else {
		
			LoginBean change = new LoginBean();
			
			String paramEmail=request.getParameter("email");
			String paramPass=request.getParameter("password");
			
			//Getting attribute email
			change.setEmail((String)session.getAttribute("EMAIL"));
			
			
			change.setPassword(paramPass);
			if(service.update(change)) {
			session.removeAttribute("EMAIL");
			response.sendRedirect("index.jsp");
			}
			else {
				response.sendRedirect("change.jsp");
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
