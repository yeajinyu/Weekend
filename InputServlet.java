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
		// name �Ӽ��� ������
		// HTTP �� ���� ��û�� ��� �Ķ����
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> ��ǲ ��� �޼���</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.printf("�Է��Ͻ� ���̵� : %s<br>", id);
		out.printf("�Է��Ͻ� ��й�ȣ : %s<br>", password);
		out.print("</BODY>");
		out.print("</HTML>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ڵ�
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// name �Ӽ��� ������
		// HTTP �� ���� ��û�� ��� �Ķ����
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<HEAD>");
		out.print("<Title> ��ǲ ��� �޼���</title>");
		out.print("</HEAD>");
		out.print("<BODY>");
		out.printf("�Է��Ͻ� ���̵� : %s<br>", id);
		out.printf("�Է��Ͻ� ��й�ȣ : %s<br>", password);
		out.print("</BODY>");
		out.print("</HTML>");
	}

}
