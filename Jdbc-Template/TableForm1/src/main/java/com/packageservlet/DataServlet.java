package com.packageservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet2.DetailsPerson;
import com.servlet2.PersonDao;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/person.do")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  HttpSession session=request.getSession();
		    ServletContext application=getServletContext();
		    
		    Integer scount=(Integer)session.getAttribute("count");
		    Integer acount=(Integer)application.getAttribute("count");
		    
		    if(scount==null)
		    	session.setAttribute("count", 1);
		    else
		    	session.setAttribute("count",scount+1);
		    
		    if(acount==null)
		    	application.setAttribute("count", 1);
		    else
		    	application.setAttribute("count",acount+1);
		request.setAttribute("peoplelist", PersonDao.getPeople());
		RequestDispatcher rd= request.getRequestDispatcher("Newjsp.jsp");
		rd.forward(request, response);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

int EmpId= Integer.parseInt(request.getParameter("EmpId"));
		String Name = request.getParameter("Name");
		   String City = request.getParameter("City");
		   String designation= request.getParameter("designation");
		   DetailsPerson D= new DetailsPerson(EmpId, Name, City, designation);
		   if(PersonDao.insert(D))
			   response.sendRedirect("person.do");
		   else
			   response.getWriter().print("Something went wrong check log");
	
	}

}
