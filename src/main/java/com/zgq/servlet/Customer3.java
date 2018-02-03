package com.zgq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.Converter;
import com.zgq.dao.CustomerDao;
import com.zgq.dao.CustomerDaoImpl;
import com.zgq.vo.Tuser;

/**
 * Servlet implementation class Customer3
 */
public class Customer3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    Tuser t=Converter.conver(Tuser.class, request);
	    System.out.println(t.toString());
	    CustomerDao c=ServiceFactory.getObject(CustomerDaoImpl.class);
	    c.addUser(t);
	    request.getRequestDispatcher("saveInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
