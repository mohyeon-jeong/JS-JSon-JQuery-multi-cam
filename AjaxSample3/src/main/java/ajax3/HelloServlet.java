package ajax3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet doGet()");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		System.out.println("id : " + id + " pw : " + pw);
		
		// String
//		String str = "asdf";
//		
//		JSONObject jObj = new JSONObject();
//		jObj.put("str", str);
//		resp.setContentType("application/x-json; charset=utf-8");
//		resp.getWriter().print(jObj);
		
		// Object
//		Human human = new Human("Hong", 24);
//		
//		JSONObject jObj = new JSONObject();
//		jObj.put("human", human);
//		
//		resp.setContentType("application/x-json; charset=utf-8");
//		resp.getWriter().print(jObj);
		
		// List
//		List<Human> list = new ArrayList<>();
//		list.add(new Human("ㅁㄴㅇ", 24));
//		list.add(new Human("asd", 22));
//		list.add(new Human("ㄹㅈㄷㄱ", 28));
//		
//		JSONObject jObj = new JSONObject();
//		jObj.put("list", list);
//		
//		resp.setContentType("application/x-json; charset=utf-8");
//		resp.getWriter().print(jObj);
		
		// Map
		String str = "asdf";
		
		List<Human> list = new ArrayList<>();
		list.add(new Human("ㅁㄴㅇ", 24));
		list.add(new Human("asd", 22));
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("title", str);
		map.put("mylist", list);
		
		JSONObject jObj = new JSONObject();
		jObj.put("map", map);
		
		resp.setContentType("application/x-json; charset=utf-8");
		resp.getWriter().print(jObj);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
















