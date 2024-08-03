package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResult {

    private String customerID;

    private String customerName;

    private String email;

    private String telephone;

    private String address;

    private String sourceTable;
}
