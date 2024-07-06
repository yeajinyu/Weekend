package first_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Input.do")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// name 속성을 가져옴
		// HTTP 로 들어온 요청은 모두 파라미터
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> 인풋 결과 메세지</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.printf("입력하신 아이디 : %s<br>", id);
		out.printf("입력하신 비밀번호 : %s<br>", password);
		out.print("</BODY>");
		out.print("</HTML>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// name 속성을 가져옴
		// HTTP 로 들어온 요청은 모두 파라미터
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> 인풋 결과 메세지</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.printf("입력하신 아이디 : %s<br>", id);
		out.printf("입력하신 비밀번호 : %s<br>", password);
		out.print("</BODY>");
		out.print("</HTML>");
	}

}
