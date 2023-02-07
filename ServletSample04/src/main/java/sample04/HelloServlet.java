package sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>this is Hello</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>hello</h1>");
		HttpSession session = req.getSession(false);
		if (session == null) {
			session = req.getSession(true); // create session
//			session.setMaxInactiveInterval(30);
			session.setAttribute("visited", "1");
			pw.println("<p>first time for visit</p>");
		} else {
			String visited = (String) session.getAttribute("visited");
			
			if (visited != null) {
				int count = Integer.parseInt(visited);
				
				count++;
				
				pw.println("<p>visited " + count + " times</p>");
				session.setAttribute("visited", count + "");
			}
		}
//		session.removeAttribute("visited");
//		session.invalidate();
		pw.println("</body>");
		pw.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
