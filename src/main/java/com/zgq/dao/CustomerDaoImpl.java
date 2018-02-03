package com.zgq.dao;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.zgq.vo.Tcustomer;
import com.zgq.vo.Tuser;

public class CustomerDaoImpl implements CustomerDao {
	
	public Integer addCustomer(Tcustomer t) {
		// TODO Auto-generated method stub
		Integer n=1;
		Object[] obj=Dao.queryOne("select max(id) from Tcustomer");
       if(obj[0]!=null){
        n=((Integer)obj[0]).intValue();
       }
	    Dao.executeSql("insert into Tcustomer (customerId,idType,idInt,customerName,customerBirtyday,customerSex,customerAddress) values(?,?,?,?,?,?,?)",  n+1,t.getIdType(),t.getIdInt(),t.getCustomerName(),t.getCustomerBirtyday(),t.getCustomerSex(),t.getCustomerAddress());
	   
        return  n+1;
	}
     @Transactional
	public void addUser(Tuser t) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into Tuser (mobileInt,roamingStatus,comLevel,customerId,isAvailable) values (?,?,?,?,1)", 
				t.getMobileInt(),t.getRoamingStatus(),t.getComLevel(),t.getCustomerId());
		Dao.executeSql("update tmobiles set isavailable=1 , cardint=(select idint from tcustomer where CustomerID=?) where mobileint=?;",t.getCustomerId(),t.getMobileInt());
	}
}
