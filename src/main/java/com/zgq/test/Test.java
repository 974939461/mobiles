package com.zgq.test;

import com.oracle.jdbc.util.ServiceFactory;
import com.zgq.dao.Converter;
import com.zgq.dao.ResourceDao;
import com.zgq.dao.ResourceDaoImpl;
import com.zgq.vo.Tmobiles;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ResourceDao r=ServiceFactory.getObject(ResourceDaoImpl.class);
		//System.out.println(r.show(0000));
	}

}
