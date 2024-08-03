package com.example.demo.dao;

import com.example.demo.entity.CustomerResult;
import java.util.List;

public interface CustomerDetailsDAO {

    List<CustomerResult> getCustomerByID(String ID);

}
