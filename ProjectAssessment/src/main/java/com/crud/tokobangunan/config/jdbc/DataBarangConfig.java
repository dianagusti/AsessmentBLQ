package com.crud.tokobangunan.config.jdbc;

import com.crud.tokobangunan.config.variable.AppConstant;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataBarangConfig {

    @Qualifier(AppConstant.BEAN_DS_DATABARANG)
    private HikariDataSource dataSource;

    @Bean(AppConstant.BEAN_JDBC_DATABARANG)
    public JdbcTemplate jdbcDataBarang(@Qualifier(AppConstant.BEAN_DS_DATABARANG) HikariDataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}