
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    public TestGenericServlet() {
        super();
}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    //set response content type
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//write response
		Date d = new Date();
		pw.println("<b><i><center> Date and Time is " +d +"</b></i></Center>");
		//pw.println(response.getClass().getName());
		//pw.println(request.getClass().getName());
		pw.close();
	}

}
