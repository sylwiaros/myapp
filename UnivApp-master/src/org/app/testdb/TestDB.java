// package org.app.testdb;

// import java.io.IOException;
// import java.io.PrintWriter;

// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import java.sql.*;
// /**
//  * Servlet implementation class TestDB
//  */
// @WebServlet("/TestDB")
// public class TestDB extends HttpServlet {
// 	private static final long serialVersionUID = 1L;

// 	/**
// 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
// 	 */
// 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 		/*
// 		 * Setup connection variables
// 		 */
// 		String user = "springstudent";
// 		String pass = "springstudent";
// 		String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
// 		String driver = "com.mysql.cj.jdbc.Driver";
// 		/*
// 		 * Get connection to database
// 		 */
// 		try {
// 			PrintWriter out = response.getWriter();
// 			out.println("Connecting to database: " + jdbcURL);
// 			Class.forName(driver);
// 			Connection connection = DriverManager.getConnection(jdbcURL, user, pass);
// 			out.println("Connected!");
// 			connection.close();
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 			throw new ServletException(e);
// 		}
// 	}

// }
