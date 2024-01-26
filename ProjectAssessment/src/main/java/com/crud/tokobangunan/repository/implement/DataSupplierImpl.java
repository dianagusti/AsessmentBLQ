package com.crud.tokobangunan.repository.implement;

import com.crud.tokobangunan.config.properties.AppProperties;
import com.crud.tokobangunan.config.variable.AppConstant;
import com.crud.tokobangunan.model.DataSupplier;
import com.crud.tokobangunan.repository.DataSupplierRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class DataSupplierImpl implements DataSupplierRepository {

    private final AppProperties appProperties;
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public DataSupplierImpl(@Qualifier(AppConstant.BEAN_APP_CONF) AppProperties appProperties,
                            @Qualifier(AppConstant.BEAN_JDBC_DATABARANG) JdbcTemplate jdbcTemplate) {
        this.appProperties = appProperties;
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
    }
//    @Override
//    public DataSu findDataSupplier(String seqId) {
//        log.info("[----EXECQUERY {} :: {} -> {}]", "findDataBarangBySeqId", appProperties.getQUERY_FIND_BY_SEQID(), seqId);
//        return jdbcTemplate.query(appProperties.getQUERY_FIND_BY_SEQID(), new BeanPropertyRowMapper<>(DataBarang.class), seqId).stream().findFirst().orElse(null);
//    }
    @Override
    public List<DataSupplier> getAllDataSupplier() {
    log.info("[----EXECQUERY {} :: {}]", "getAllDataBarang", appProperties.getQUERY_GET_ALL_SUPPLIER());
    return namedParameterJdbcTemplate.query(appProperties.getQUERY_GET_ALL_SUPPLIER(), new BeanPropertyRowMapper<>(DataSupplier.class));
}
}
