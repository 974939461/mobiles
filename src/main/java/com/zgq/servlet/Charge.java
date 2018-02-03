package com.zgq.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.ChargeDao;
import com.zgq.dao.ChargeDaoImpl;
import com.zgq.dao.Converter;
import com.zgq.dao.ResourceDao;
import com.zgq.dao.ResourceDaoImpl;
import com.zgq.vo.Tcharge;

/**
 * Servlet implementation class Charge
 */
public class Charge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Charge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   Tcharge t=Converter.conver(Tcharge.class, request);
		ChargeDao r=ServiceFactory.getObject(ChargeDaoImpl.class);
        r.change(t);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
