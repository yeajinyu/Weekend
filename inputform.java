package first_;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputForm.do")
public class inputform extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		/*
		 * String id = request.getParameter("id"); String password =
		 * request.getParameter("password");
		 */
		SimpleDateFormat tool = new SimpleDateFormat("yyyy-mm-dd");
		
		Date birth=null;
		try {
			birth = tool.parse(request.getParameter("birth"));
		}catch(ParseException e){
			e.printStackTrace();
		}
		request.setAttribute("birth", birth); /* ��ü ���·� �����ͼ��� */
		
		Map<String, String> hobbyMap = new HashMap<>();
		hobbyMap.put("1", "�");	hobbyMap.put("2", "����");
		hobbyMap.put("3", "�丮");	hobbyMap.put("4", "����");
		
		String[] hobbys = request.getParameterValues("hobby"); /* ��Ʈ���迭 */
		String hobbyData = "";
		if(hobbys != null && hobbys.length != 0) {
			for(String key : hobbys) {
				hobbyData += key + "";
			}
		}else {
			hobbyData += "���þ���";
		}
		request.setAttribute("hobbyData", hobbyData); /* ��ü ���·� �����ͼ��� */
		/*
		 * String gender = request.getParameter("gender"); String email =
		 * request.getParameter("email"); String tel = request.getParameter("tel");
		 * Integer grade = Integer.parseInt(request.getParameter("grade"));
		 */

		Map<String, String> areaMap = new HashMap<>();
		areaMap.put("1", "����");		areaMap.put("2", "���");
		areaMap.put("3", "��õ");		areaMap.put("4", "����");
		
		String area = request.getParameter("area"); String intro =
		request.getParameter("intro");
		 
		request.setAttribute("areaData", areaMap.get(area)); /* ��ü ���·� �����ͼ��� */
		request.getRequestDispatcher("/inputFormResult.jsp").forward(request, response);
		
		/*
		 * response.setContentType("text/html; charset=UTF-8"); PrintWriter out =
		 * response.getWriter();
		 * 
		 * out.print("<HTML>"); out.print("<HEAD>");
		 * out.print("<Title> ��ǲ ��� �޼���</title>"); out.print("</HEAD>");
		 * out.print("<BODY>"); out.printf("���̵� : %s<br>", id);
		 * out.printf("��й�ȣ : %s<br>", password); out.printf("������� : %s<br>",
		 * birth.toString());
		 * 
		 * out.printf("��� : "); if(hobbys != null && hobbys.length != 0) { for(String
		 * key : hobbys) { out.printf("%s", hobbyMap.get(key)); } }else {
		 * out.print("���þ���"); }
		 * 
		 * out.printf("<br>"); out.printf("���� : %s<br>", gender.equals("1") ? "��" :
		 * "��"); out.printf("�̸��� : %s<br>", email); out.printf("����ó : %s<br>", tel);
		 * out.printf("�г� : %d<br>", grade); out.printf("���� : %s<br>"
		 * ,areaMap.get(area)); out.printf("�ڱ�Ұ� : <pbe>%s</pbe><br>" ,intro);
		 * out.print("</BODY>"); out.print("</HTML>");
		 */
		
		
	}

}
