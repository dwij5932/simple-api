package com.example.demo.util;

public class DBQueries {

    private DBQueries() {
        throw new IllegalStateException("Utility class");
    }

    public static final String GET_CUSTOMER_BY_ID = "SELECT customer_id, customer_name AS name, email, telephone, address, 'Customer' AS source_table " +
            "FROM master_data.customer_detail " +
            "WHERE customer_id = :customer_id " +
            "UNION ALL " +
            "SELECT customer_id, enterprise_name AS name, email, telephone, address, 'Enterprise' AS source_table " +
            "FROM master_data.enterprise_detail " +
            "WHERE customer_id = :customer_id";
}
