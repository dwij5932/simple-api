package com.example.demo.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.example.demo.entity.CustomerResult;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerResultMapper implements RowMapper<CustomerResult> {

    @Override
    public CustomerResult mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return CustomerResult.builder()
                .customerID(resultSet.getString("customer_id"))
                .customerName(resultSet.getString("name"))
                .email(resultSet.getString("email"))
                .telephone(resultSet.getString("telephone"))
                .address(resultSet.getString("address"))
                .sourceTable(resultSet.getString("source_table"))
                .build();

    }
}
