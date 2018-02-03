package com.zgq.dao;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

public class Converter {
       
	public static <T> T conver(Class<T> cla,HttpServletRequest request){
		Field[] f=cla.getDeclaredFields();
		T t=null;
		try {
			  t=cla.newInstance();
			for(Field ff:f){
			 
			  if(request.getParameter(ff.getName())!=null&&!request.getParameter(ff.getName()).equals("")){
				ff.setAccessible(true);
				if(ff.getType()==String.class){
					ff.set(t, request.getParameter(ff.getName()));
				}
				else if(ff.getType()==Integer.class||ff.getType()==int.class){
					ff.set(t, Integer.valueOf(request.getParameter(ff.getName())));
				}else if(ff.getType()==Long.class||ff.getType()==long.class){
					ff.set(t, Long.valueOf(request.getParameter(ff.getName())));
				}
				else if(ff.getType().isArray()){
					ff.set(t, request.getParameterValues(ff.getName()));
				}
			  }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
             return t;
	}
}
