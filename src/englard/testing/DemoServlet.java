package englard.testing;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		ArrayList<String> links = new ArrayList<String>();
		links.add("one");
		links.add("two");
		resp.setContentType("text/plain");
		for(int i=0; i<links.size(); i++){
		resp.getWriter().println(links.get(i));
		
	
		resp.getWriter().println(req.getRequestURL().toString());
			
		//resp.write(" " & req.querystring("lname"));
		}
		

	}
}
