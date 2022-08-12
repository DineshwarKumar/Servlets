package com.vfi.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteredServlet
 */

@WebServlet("/registeredservlet")
public class RegisteredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String username=request.getParameter("username");
	int studentid=Integer.parseInt(request.getParameter("studentid"));
	String city=request.getParameter("city");
	String language=request.getParameter("language");
	String[] hobbies= request.getParameterValues("hobby");
	
	out.print("<html><body>");
	out.print("Welcome "+username+"<br>");
	out.print("Student ID : "+studentid+"<br>");
	out.print("Your City : "+city+"<br>");
	out.print("Language : "+language+"<br>");
	out.print("Hobbies are : ");
	Stream.of(hobbies).forEach(out::println);
	out.print("</body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
