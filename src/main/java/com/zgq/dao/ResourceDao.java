package com.zgq.dao;

import java.util.List;

import com.zgq.vo.Tmobiles;
import com.zgq.vo.Toperator;

public interface ResourceDao {
    public Toperator login(String name,String password);
    public void add(Tmobiles t);
    public List<Tmobiles> show(String l);
}
