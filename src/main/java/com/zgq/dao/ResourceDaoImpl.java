package com.zgq.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.zgq.vo.Tmobiles;
import com.zgq.vo.Toperator;

public class ResourceDaoImpl implements ResourceDao {

	public Toperator login(String name, String password) {
		// TODO Auto-generated method stub
	return Dao.queryOne("select * from Toperator where operatorName=? and operatorPwd=?", Toperator.class,name,password);
	}

	public void add(Tmobiles t) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into tmobiles (mobileint,mobiletype,isavailable) values (?,?,2)", t.getMobileInt(),t.getMobileType());
	}

	public List<Tmobiles> show(String l) {
		// TODO Auto-generated method stub
		return Dao.query("select * from Tmobiles where mobileint like ? and isavailable=2", Tmobiles.class, "%"+l+"%");
	}

}
