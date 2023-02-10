package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import net.sf.json.JSONObject;

@WebServlet("/member")
public class MemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}

	public void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String param = req.getParameter("param");
		
		if (param.equals("login")) {
			resp.sendRedirect("login.jsp");
		} else if (param.equals("regi")) {
			resp.sendRedirect("regi.jsp");
		} else if (param.equals("idcheck")) { // ajax
			String id = req.getParameter("id");
			
			MemberDao dao = MemberDao.getInstance();
			boolean b = dao.getId(id);
			
			String str = "NO";
			if (!b) {
				str = "YES";
			}
			
			JSONObject obj = new JSONObject();
			obj.put("str", str);
			
			resp.setContentType("application/x-json;charset=utf-8");
			resp.getWriter().print(obj);
		} else if (param.equals("regiAf")) {
			
		}
	}
	
}

























