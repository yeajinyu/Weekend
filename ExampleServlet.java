package first_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Example
 */
@WebServlet("/Example.do")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Integer number = Integer.parseInt(request.getParameter("number"));
		
		// 랜덤값 생성
		int ran = (int)(Math.random() * number );
		
		// name 속성을 가져옴
		// HTTP 로 들어온 요청은 모두 파라미터
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> 이름, 숫자 입력받는 페이지</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.printf("안녕하세요 %s 님. 오늘의 행운의 숫자는 %d 입니다.", name, ran);
		out.print("</BODY>");
		out.print("</HTML>");
	}

}
