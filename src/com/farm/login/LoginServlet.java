package com.farm.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.farm.user.Register;

public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			LoginDAO userDao = new LoginDAO();
			Register loginSelect = userDao.loginSelect(email, password);
			if(loginSelect==null)
			{
				response.sendRedirect("loginnotexists.jsp");
			}
			else
			{
				if(loginSelect.getEmail().equals(email)&&loginSelect.getPassword().equals(password))
				{
					response.sendRedirect("buy.jsp");
				}
				else
				{
					response.sendRedirect("logincheck.jsp");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
