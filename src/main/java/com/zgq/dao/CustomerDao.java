package com.zgq.dao;

import com.zgq.vo.Tcustomer;
import com.zgq.vo.Tuser;

public interface CustomerDao {
    public Integer addCustomer(Tcustomer t);
    public void addUser(Tuser t);
}
