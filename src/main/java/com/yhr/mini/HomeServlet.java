package com.yhr.mini;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String number = request.getParameter("number"); 
		
		int result = Integer.parseInt(number) * 5;
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter write = response.getWriter();
		
		write.println("<!DOCTYPE html>"
				+ "<html lang='ko'>"
				+ "<head>"
				+ "<meta charset='UTF-8'>"
				+ "<title>servlet</title>"
				+ "<body>"
				+ "<h1>"
				+ "보내주신 숫자에 5를 곱한 결과는"
				+ result
				+ "입니다."
				+ "</h1>"
				+ "</body>"
				+ "</html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
