package com.crud.tokobangunan.model;

import lombok.Data;

@Data
public class DataBarang {
    private String seqId;
    private String namaBarang;
    private Double hargaBarang;
    private Integer jumlahStock;
//    private String sisaStock;
}