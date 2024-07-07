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
		request.setAttribute("birth", birth); /* 객체 형태로 데이터세팅 */
		
		Map<String, String> hobbyMap = new HashMap<>();
		hobbyMap.put("1", "운동");	hobbyMap.put("2", "독서");
		hobbyMap.put("3", "요리");	hobbyMap.put("4", "없음");
		
		String[] hobbys = request.getParameterValues("hobby"); /* 스트링배열 */
		String hobbyData = "";
		if(hobbys != null && hobbys.length != 0) {
			for(String key : hobbys) {
				hobbyData += key + "";
			}
		}else {
			hobbyData += "선택없음";
		}
		request.setAttribute("hobbyData", hobbyData); /* 객체 형태로 데이터세팅 */
		/*
		 * String gender = request.getParameter("gender"); String email =
		 * request.getParameter("email"); String tel = request.getParameter("tel");
		 * Integer grade = Integer.parseInt(request.getParameter("grade"));
		 */

		Map<String, String> areaMap = new HashMap<>();
		areaMap.put("1", "서울");		areaMap.put("2", "경기");
		areaMap.put("3", "인천");		areaMap.put("4", "강원");
		
		String area = request.getParameter("area"); String intro =
		request.getParameter("intro");
		 
		request.setAttribute("areaData", areaMap.get(area)); /* 객체 형태로 데이터세팅 */
		request.getRequestDispatcher("/inputFormResult.jsp").forward(request, response);
		
		/*
		 * response.setContentType("text/html; charset=UTF-8"); PrintWriter out =
		 * response.getWriter();
		 * 
		 * out.print("<HTML>"); out.print("<HEAD>");
		 * out.print("<Title> 인풋 결과 메세지</title>"); out.print("</HEAD>");
		 * out.print("<BODY>"); out.printf("아이디 : %s<br>", id);
		 * out.printf("비밀번호 : %s<br>", password); out.printf("생년월일 : %s<br>",
		 * birth.toString());
		 * 
		 * out.printf("취미 : "); if(hobbys != null && hobbys.length != 0) { for(String
		 * key : hobbys) { out.printf("%s", hobbyMap.get(key)); } }else {
		 * out.print("선택없음"); }
		 * 
		 * out.printf("<br>"); out.printf("성별 : %s<br>", gender.equals("1") ? "남" :
		 * "여"); out.printf("이메일 : %s<br>", email); out.printf("연락처 : %s<br>", tel);
		 * out.printf("학년 : %d<br>", grade); out.printf("지역 : %s<br>"
		 * ,areaMap.get(area)); out.printf("자기소개 : <pbe>%s</pbe><br>" ,intro);
		 * out.print("</BODY>"); out.print("</HTML>");
		 */
		
		
	}

}
