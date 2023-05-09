package ex04_response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 	응답
		 * 
		 * 	1. 서버 -> 클라이언트 보내는 것이 응답(response)이다.
		 * 	2. HttpServletResponse클래스가 응답을 처리함.
		 * 	3. 어떤 MIME타입으로 응답할 것인지 결정해야함.
		 * 			1) HTML : text/html 	=> 태그를 만들어서 반환하는 경우
		 * 			2) XML : application/xml	=> ajax 응답이 XML인 경우
		 * 			3) JSON : application/json => ajax 응답이 JSON인 경우
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
