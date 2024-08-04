package com.example.demo.controller;

import com.example.demo.entity.CustomerResult;
import com.example.demo.service.impl.CustomerDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerDetailsControl {

    private final CustomerDetailsServiceImpl customerDetailsService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResult> getCustomerDetails(@PathVariable("id") String ID){
        System.out.println("ID: " + ID);
        CustomerResult customerResult = customerDetailsService.getCustomerDetails(ID);
        System.out.println(customerResult);
        if (customerResult == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customerResult);

    }
}
