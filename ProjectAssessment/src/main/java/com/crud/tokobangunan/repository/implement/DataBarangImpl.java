package com.crud.tokobangunan.repository.implement;

import com.crud.tokobangunan.config.properties.AppProperties;
import com.crud.tokobangunan.config.variable.AppConstant;
import com.crud.tokobangunan.model.DataBarang;
import com.crud.tokobangunan.repository.DataBarangRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class DataBarangImpl implements DataBarangRepository {
    private final AppProperties appProperties;
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public DataBarangImpl(@Qualifier(AppConstant.BEAN_APP_CONF) AppProperties appProperties,
                          @Qualifier(AppConstant.BEAN_JDBC_DATABARANG) JdbcTemplate jdbcTemplate) {
        this.appProperties = appProperties;
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
    }

    @Override
    public List<DataBarang> getAllDataBarang() {
        log.info("[----EXECQUERY {} :: {}]", "getAllDataBarang", appProperties.getQUERY_GET_ALL());
        return namedParameterJdbcTemplate.query(appProperties.getQUERY_GET_ALL(), new BeanPropertyRowMapper<>(DataBarang.class));
    }

    @Override
    public DataBarang findDataBarangBySeqId(String seqId) {
        log.info("[----EXECQUERY {} :: {} -> {}]", "findDataBarangBySeqId", appProperties.getQUERY_FIND_BY_SEQID(), seqId);
        return jdbcTemplate.query(appProperties.getQUERY_FIND_BY_SEQID(), new BeanPropertyRowMapper<>(DataBarang.class), seqId).stream().findFirst().orElse(null);
    }

    @Override
    public void insertDataBarang(DataBarang dataBarang) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("namaBarang", dataBarang.getNamaBarang());
        mapSqlParameterSource.addValue("hargaBarang", dataBarang.getHargaBarang());
        mapSqlParameterSource.addValue("jumlahStock", dataBarang.getJumlahStock());
        namedParameterJdbcTemplate.update(appProperties.getQUERY_INSERT_DATABARANG(), mapSqlParameterSource);
        log.info("[----EXECQUERY {} :: {} -> {} | {} | {}]", "insertDataBarang", appProperties.getQUERY_INSERT_DATABARANG(), dataBarang.getNamaBarang(), dataBarang.getHargaBarang(), dataBarang.getJumlahStock());
    }

    public void updateDataBarang(DataBarang dataBarang) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("seqId", dataBarang.getSeqId());
        mapSqlParameterSource.addValue("namaBarang", dataBarang.getNamaBarang());
        mapSqlParameterSource.addValue("hargaBarang", dataBarang.getHargaBarang());
        mapSqlParameterSource.addValue("jumlahStock", dataBarang.getJumlahStock());
        namedParameterJdbcTemplate.update(appProperties.getQUERY_UPDATE_DATABARANG(), mapSqlParameterSource);
        log.info("[----EXECQUERY {} :: {} -> {} | {} | {} | {}]", "updateDataBarang", appProperties.getQUERY_UPDATE_DATABARANG(), dataBarang.getSeqId(), dataBarang.getNamaBarang(), dataBarang.getHargaBarang(), dataBarang.getJumlahStock());
    }

    @Override
    public void deleteDataBarangBySeqId(String seqId) {
        jdbcTemplate.update(appProperties.getQUERY_DELETE_DATABARANG(), seqId);
        log.info("[----EXECQUERY {} :: {} -> {}]", "deleteDataBarang", appProperties.getQUERY_DELETE_DATABARANG(), seqId);
    }
}