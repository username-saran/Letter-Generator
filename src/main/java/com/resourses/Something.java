package com.resourses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Something
 */
@WebServlet("/something")
public class Something extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Something() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("name");
		String department = request.getParameter("dept");
		String YearSection = request.getParameter("yesec");
		String letterString = request.getParameter("content");
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.print("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "     <meta charset=\"UTF-8\">\r\n"
				+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "     <title>Leave</title>\r\n"
				+ "     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "     \r\n"
				+ "     <style>\r\n"
				+ "          \r\n"
				+ "          @media print {\r\n"
				+ "               .noPrint{\r\n"
				+ "                    display:none;\r\n"
				+ "               }\r\n"
				+ "          } \r\n"
				+ "            \r\n"
				+ "     </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "     <div class=\"container-fluid noPrint\">\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\" align=\"center\" style=\"background-color: white;\">\r\n"
				+ "                    <h1>Letter Generator</h1><sub><h6>Easy ur work</h6></sub>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "     </div>\r\n"
				+ "    <div class=\"container justify-content-center align-items-center\">\r\n"
				+ "          <div class=\"row\">\r\n"
				+ "               <div class=\"col\">\r\n"
				+ "                    <div id=\"section-to-print\">\r\n"
				+ "                         <div id=\"datelocation\" style=\"float: right;\">\r\n"
				+ "                              03-12-2022\r\n"
				+ "                              <br>\r\n"
				+ "                              Coimbatore\r\n"
				+ "                         </div>\r\n"
				+ "                         <br>\r\n"
				+ "                         <div id=\"from\">\r\n"
				+ "                              From:\r\n"
				+ "                              <br>\r\n"
				+ "                              "+name+"\r\n"
				+ "                              <br>\r\n"
				+ "                              "+YearSection+"\r\n"
				+ "                              <br>\r\n"
				+ "                              Department of "+department+"\r\n"
				+ "                              <br>\r\n"
				+ "                              Karpagam college of Engineering, Coimbatore-641032\r\n"
				+ "                         </div>\r\n"
				+ "                         <br>\r\n"
				+ "                         <div id=\"to\">\r\n"
				+ "                              To:\r\n"
				+ "                              <br>\r\n"
				+ "                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "                              <br>\r\n"
				+ "                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "                              <br>\r\n"
				+ "                              Department\r\n"
				+ "                              <br>\r\n"
				+ "                              Karpagam College of Engineering, Coimbatore-641032\r\n"
				+ "                         </div>\r\n"
				+ "                         <br>\r\n"
				+ "                         <div id=\"through\">\r\n"
				+ "                              Through:\r\n"
				+ "                              <br>\r\n"
				+ "                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "                              <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "                         </div>\r\n"
				+ "                         <br>\r\n"
				+ "                         <div id=\"content\">\r\n"
				+ "                              Respected Sir/Madam,\r\n"
				+ "                              <br>\r\n"
				+ "                              Sub:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n"
				+ "                     \r\n"
				+ "                              <br><br><br><br><br><br><br><br><br><br>\r\n"
				+ "                              &nbsp;&nbsp;&nbsp;"+letterString+"\r\n"
				+ "                              <br>\r\n"
				+ "                              <center><span align=\"center\">Thanking you</span></center>\r\n"
				+ "                         </div>\r\n"
				+ "                         <br>\r\n"
				+ "                         <div id=\"obe\" style=\"float: right;\">\r\n"
				+ "                              Yours obediently\r\n"
				+ "                              <br>\r\n"
				+ "                              "+name+"\r\n"
				+ "                         </div>\r\n"
				+ "                    </div>\r\n"
				+ "               </div>\r\n"
				+ "          </div>\r\n"
				+ "          <center>\r\n"
				+ "               <input type=\"button\" class=\"btn btn-primary noPrint\" name=\"Print\" value=\"Print\" onclick=\"window.print()\">\r\n"
				+ "          </center>\r\n"
				+ "     </div>\r\n"
				+ "     \r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
