package first_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mylogin.do")
public class Mylogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		/*
		 * if(id.equals(exampleid) && password.equals(password)) {
		 * request.getRequestDispatcher("/loginsuccess.do").forward(request, response);
		 * }else { request.getRequestDispatcher("/loginfail.do").forward(request,
		 * response); }
		 */
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<HTML>");
		out.print("<HEAD>");

		if(id.equals("aaa") && password.equals("bbb")) {			
			out.printf("�ȳ��ϼ��� %s �� ȯ���մϴ�.", id);
		}else {
			out.print("�α��ο� �����Ͽ����ϴ�");
			
		}
		out.print("</BODY>");
		out.print("</HTML>");
		 
	}

}
