package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nationality, gender;
		gender = request.getParameter("gender");
		System.out.println(gender);
		nationality = request.getParameter("nationality");

		System.out.println(nationality);

		HRMaster hr = new HRMaster();
		hr.setGender(gender);
		hr.setNationality(nationality);

		HrDao dao = new HrDao();
		dao.selectData(hr);
	}

}
