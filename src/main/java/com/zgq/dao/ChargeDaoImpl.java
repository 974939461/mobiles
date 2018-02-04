package com.zgq.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.zgq.vo.Tcharge;
import com.zgq.vo.TchargeRule;

public class ChargeDaoImpl implements ChargeDao {

	public void change(Tcharge t) {
		// TODO Auto-generated method stub
       Dao.executeSql("update tcharge set charge=? where chargecode=?", t.getCharge(),t.getChargeCode());
	}
    @Transactional
	public void addCharge(String[] s) {
		// TODO Auto-generated method stub
		Dao.executeSql("delete from tcharge_rule");
		for(int i=0;i<s.length;i++)
		Dao.executeSql("insert into tcharge_rule (chargecode) values (?)", s[i]);
	}
	public List<Tcharge> change1() {
		// TODO Auto-generated method stub
		return Dao.query("select * from tcharge", Tcharge.class);
	}

}
