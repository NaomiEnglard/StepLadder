package stepLadder;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Englard_testingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Welcome to Step Ladder Please fill in the following form to become a new user");
		// only redirect if they are a user
		String url = req.getRequestURL().toString();
		// if the user name is in system
		resp.getWriter().println(url);		//and if password matches username
		
		//redirect to correct url
		resp.sendRedirect("createUser.html");
	}
}
