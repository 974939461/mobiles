package com.zgq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.Converter;
import com.zgq.dao.ResourceDao;
import com.zgq.dao.ResourceDaoImpl;
import com.zgq.vo.Toperator;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Toperator t=Converter.conver(Toperator.class, request);
		ResourceDao r=ServiceFactory.getObject(ResourceDaoImpl.class);
		Toperator t1=r.login(t.getOperatorName(), t.getOperatorPwd());
		if(t1!=null){
			    request.getSession().setAttribute("user", t1);
			    response.sendRedirect("main.jsp");	
		}else
			response.sendRedirect("index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
