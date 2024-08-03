package com.example.demo.controller;

import com.example.demo.dao.CustomerDetailsDAO;
import com.example.demo.entity.CustomerResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class Alian {

    private final CustomerDetailsDAO customerDetailsDAO;
    @GetMapping
    public String getAlian(){
        List<CustomerResult> cusomer = customerDetailsDAO.getCustomerByID("CUST001");
        System.out.println(cusomer);
        return "Hi";
    }
}
