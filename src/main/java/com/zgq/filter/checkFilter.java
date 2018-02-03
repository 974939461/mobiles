package com.zgq.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.zgq.vo.Toperator;

/**
 * Servlet Filter implementation class checkFilter
 */
public class checkFilter implements Filter {
    List<String> l=new ArrayList<String>();
    /**
     * Default constructor. 
     */
    public checkFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");
        HttpServletRequest r1=(HttpServletRequest) request; 
        HttpServletResponse r2=(HttpServletResponse) response; 

        String uri=r1.getRequestURI();
        String u=uri.replaceAll(r1.getContextPath(), "");
		Toperator t=(Toperator) r1.getSession().getAttribute("user");
		if("/Login.do".equals(u)){
			chain.doFilter(request, response);
		}else if(t!=null){
			 if(t.getIsAdmin()==1){
				 chain.doFilter(request, response); 
			 }else if(l.contains(u)){
				 r2.setContentType("text/plain;charset=utf-8");
				 r2.getWriter().append("你无权限操作此页面");
			 }else
				 chain.doFilter(request, response);	
		}else
			r2.sendRedirect("index.html");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	   l.add("/charge.jsp");
	   l.add("/resource.jsp");
	}

}
