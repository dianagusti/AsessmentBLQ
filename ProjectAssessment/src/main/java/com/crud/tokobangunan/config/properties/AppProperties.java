package com.crud.tokobangunan.config.properties;

import lombok.Data;

@Data
public class AppProperties {

    /* App Config */
    private String APP_NAME = "toko-bangunan";
    private String APP_VERSION = "v1";

    /* Query */
    private String QUERY_GET_ALL = "SELECT * FROM barang ORDER BY \"seqId\" ASC";
    private String QUERY_FIND_BY_SEQID = "SELECT * FROM barang WHERE \"seqId\" = ?";
    private String QUERY_INSERT_DATABARANG = "INSERT INTO barang (\"namaBarang\", \"hargaBarang\", \"jumlahStock\") VALUES (:namaBarang, :hargaBarang, :jumlahStock)";
    private String QUERY_UPDATE_DATABARANG = "UPDATE barang SET \"namaBarang\" = :namaBarang, \"hargaBarang\" = :hargaBarang, \"jumlahStock\" = :jumlahStock WHERE \"seqId\" = :seqId";
    private String QUERY_DELETE_DATABARANG = "DELETE FROM barang WHERE \"seqId\" = ?";
    private String QUERY_GET_USER = "SELECT username, password, role FROM \"user\" WHERE \"username\" = :username";
    private String QUERY_GET_ALL_SUPPLIER = "SELECT * FROM supplier";
}