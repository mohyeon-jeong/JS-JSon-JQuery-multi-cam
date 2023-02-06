package sample01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String sAge = req.getParameter("age");
		int age = Integer.parseInt(sAge);

		resp.setContentType("text/html; charset=utf-8");

		PrintWriter pw = resp.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>title</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>name : " + name + "</p>");
		pw.println("<p>age : " + age + "</p>");
		pw.println("</body>");
		pw.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		String name = req.getParameter("name");
		String sAge = req.getParameter("age");
		int age = Integer.parseInt(sAge);

		resp.setContentType("text/html; charset=utf-8");

		PrintWriter pw = resp.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>title</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>name : " + name + "</p>");
		pw.println("<p>age : " + age + "</p>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
