 package com.packageservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booksauthour.Books;
import com.booksauthour.LibraryDao;

/**
 * Servlet implementation class BooksServlet
 */
@WebServlet({  "/book.do" })
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("Blist", LibraryDao.getBookdet());
		request.setAttribute("Alist", LibraryDao.getAuthourdet());
		
		RequestDispatcher rd= request.getRequestDispatcher("Books.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int bid= Integer.parseInt(request.getParameter("bid"));
		String name = request.getParameter("name");
		   int price = Integer.parseInt(request.getParameter("price"));
		   int authourid = Integer.parseInt(request.getParameter("authourid"));
		   int pages =Integer.parseInt( request.getParameter("pages"));
		   Books B= new Books(bid, name, price, authourid,pages);
		   if(LibraryDao.insert(B))
			   response.sendRedirect("book.do");
		   else
			   response.getWriter().print("Something went wrong check log");
	
	}

}
