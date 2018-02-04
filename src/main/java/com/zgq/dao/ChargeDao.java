package com.zgq.dao;

import java.util.List;

import com.zgq.vo.Tcharge;
import com.zgq.vo.TchargeRule;

public interface ChargeDao {
      public void change(Tcharge t);
      public void addCharge(String[] s);
      public List<Tcharge> change1();
     
}
