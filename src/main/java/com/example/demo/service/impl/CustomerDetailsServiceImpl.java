package com.example.demo.service.impl;

import com.example.demo.dao.CustomerDetailsDAO;
import com.example.demo.entity.CustomerResult;
import com.example.demo.service.CustomerDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    private final CustomerDetailsDAO customerDetailsDAO;

    @Override
    public CustomerResult getCustomerDetails(String ID) {
        List<CustomerResult> customer = customerDetailsDAO.getCustomerByID(ID);

        if (customer.isEmpty()){
            return null;
        }else{
            return customer.get(0);
        }
    }
}
