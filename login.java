package first_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("/login.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		if(id.equals("aaa") && password.equals("bbb")) {			
			request.getRequestDispatcher("/myPage.jsp").forward(request, response);
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("/myPage.jsp");
			/* redirect : ���û�Ѵ�, �ٽú����� index �������ؼ�*/
		}else {
			request.setAttribute("message","�α��ο� �����߽��ϴ�.");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		 
	}

}
