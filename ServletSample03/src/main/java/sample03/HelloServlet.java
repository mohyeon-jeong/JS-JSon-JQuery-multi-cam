package sample03;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.Human;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}
	
	public void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		
		System.out.println("name : " + name);
		
		// uses sendRedirect in response
		// need to encode when korean
//		String ename = URLEncoder.encode(name);
//		String eaddress = URLEncoder.encode(address);
//		
////		resp.sendRedirect("world");
//		resp.sendRedirect("world?name=" + ename + "&age=" + age + "&address=" + eaddress);
		
		// RequestDispatcher forward
		Human h = new Human(name, age, address);
		req.setAttribute("human", h);
		req.getRequestDispatcher("world").forward(req, resp);
	}

}
















