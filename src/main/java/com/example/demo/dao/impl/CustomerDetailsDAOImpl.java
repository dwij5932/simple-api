package com.example.demo.dao.impl;

import com.example.demo.dao.CustomerDetailsDAO;
import com.example.demo.entity.CustomerResult;
import com.example.demo.mapper.CustomerResultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.util.DBQueries.GET_CUSTOMER_BY_ID;

@Repository
@RequiredArgsConstructor
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<CustomerResult> getCustomerByID(String ID) {
        try{
            MapSqlParameterSource parameterSource = new MapSqlParameterSource();
            parameterSource.addValue("customer_id", ID);
            return  namedParameterJdbcTemplate.query(GET_CUSTOMER_BY_ID, parameterSource, new CustomerResultMapper());

        }catch (DataAccessException e){
            throw e;
        }
    }
}
