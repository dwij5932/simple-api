package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Enterprise {

    private String customerID;

    private String enterpriseName;

    private String email;

    private String telephone;

    private String address;

}
