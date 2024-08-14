import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("cusid");
		String pass = req.getParameter("password");
		System.out.println("id and pass is "+ id + " "+pass);
		boolean loginResult=false;
		Connection con = LoginController.getConnection();
		System.out.println("Connection is "+con);
		String loginCheck = "Select * from tmsuserdata where id = ? and pass = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(loginCheck);
			ps.setString(1, id);
			ps.setString(2, pass);
			ResultSet rs =  ps.executeQuery();
			
			if(rs.next()) {
				loginResult=true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		if(loginResult) {
			resp.sendRedirect("dashboard.jsp");
		}else {
			resp.sendRedirect("index.jsp");
		}
		
	}
	
	
}
