package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BbsDao;
import db.DBClose;
import db.DBConnection;
import dto.BbsDto;

@WebServlet("/bbs")
public class BbsController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req, resp);
	}

	public void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DBConnection.initConnection();
		
		req.setCharacterEncoding("utf-8");
		
		String param = req.getParameter("param");
		
		if(param.equals("bbslist")) {
			String choice = req.getParameter("choice");
			String search = req.getParameter("search");
			
			if (choice == null || search == null) {
				choice = "";
				search = "";
			}
			
			BbsDao dao = BbsDao.getInstance();
			List<BbsDto> list = dao.getBbsSearchList(choice, search);
			
			req.setAttribute("bbslist", list);		// 짐싸!
			forward("bbslist.jsp", req, resp);	// 잘가!
		} else if (param.equals("bbswrite")) {
			resp.sendRedirect("bbswrite.jsp");
		} else if (param.equals("bbswriteAf")) {
			String id = req.getParameter("id");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			BbsDao dao = BbsDao.getInstance();
			boolean isS = dao.writeBbs(new BbsDto(id, title, content));
			
			String bbswrite = "";
			if (isS) {
				bbswrite = "BBS_ADD_OK";
			} else {
				bbswrite = "BBS_ADD_NO";
			}
			
			req.setAttribute("bbswrite", bbswrite);
			forward("message.jsp", req, resp);
		}
		
	}
	
	public void forward(String linkName, HttpServletRequest req, HttpServletResponse resp) {
		RequestDispatcher dispatcher = req.getRequestDispatcher(linkName);		
		try {
			dispatcher.forward(req, resp);		
		} catch (ServletException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}




