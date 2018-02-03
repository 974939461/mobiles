package com.zgq.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.Converter;
import com.zgq.dao.ResourceDao;
import com.zgq.dao.ResourceDaoImpl;
import com.zgq.vo.Tmobiles;

/**
 * Servlet implementation class PhoneNumber
 */
public class PhoneNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhoneNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s=request.getParameter("number");
		ResourceDao r=ServiceFactory.getObject(ResourceDaoImpl.class);
		List<Tmobiles> l=r.show(s);
	    request.setAttribute("l", l);
//	    response.setContentType("text/plain;charset=utf-8");
//	    response.getWriter().append(l.get(0).toString());
	    request.getRequestDispatcher("PhoneNumber.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
