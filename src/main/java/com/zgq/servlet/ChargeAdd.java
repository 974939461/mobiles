package com.zgq.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.ChargeDao;
import com.zgq.dao.ChargeDaoImpl;
import com.zgq.vo.Tcharge;

/**
 * Servlet implementation class ChargeAdd
 */
public class ChargeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChargeAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ChargeDao r=ServiceFactory.getObject(ChargeDaoImpl.class);
		List<Tcharge> l=r.change1();
		ObjectMapper o=new ObjectMapper();
		String ll=o.writeValueAsString(l);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append(ll);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
