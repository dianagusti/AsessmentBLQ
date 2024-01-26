package com.crud.tokobangunan.repository;

import com.crud.tokobangunan.model.DataBarang;

import java.util.List;

public interface DataBarangRepository {
    List<DataBarang> getAllDataBarang();
    DataBarang findDataBarangBySeqId(String seqId);
    void insertDataBarang(DataBarang dataBarang);
    void updateDataBarang(DataBarang dataBarang);
    void deleteDataBarangBySeqId(String seqId);
}