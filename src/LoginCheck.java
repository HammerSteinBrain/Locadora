import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
    }
    
    private String uname;
	private String password;
  
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.uname=request.getParameter("uname");
		this.password=request.getParameter("password");
		
		/*if (getUname().equals("adm") && getPassword().equals("1234")){
			response.sendRedirect("Home_adm.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}*/
		
		LoginDAO l = new LoginDAO();
		
		//System.out.println(l.procurar_id());
		
		if (uname.equals("admin") && password.equals("1234") && (l.procurar_id() != null)){
			response.sendRedirect("Home_adm.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
	}

}
