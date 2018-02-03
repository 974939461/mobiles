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
import com.zgq.vo.Tmobiles;

/**
 * Servlet implementation class Resource
 */
public class Resource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tmobiles t=Converter.conver(Tmobiles.class, request);
		ResourceDao r=ServiceFactory.getObject(ResourceDaoImpl.class);
		Long m2=Long.valueOf(request.getParameter("mobileInt2"));
		Long l=t.getMobileInt();
		for(int i=0;i<=m2-l;i++){
			 r.add(t);
			 t.setMobileInt(t.getMobileInt()+1);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
