package first_;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> 첫 서블릿 메세지</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		int ran = (int)(Math.random()*9+1);
		out.printf("안녕하세요. 오늘 행운 숫자는 %d입니다.", ran);
		out.print("</BODY>");
		out.print("</HTML>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
