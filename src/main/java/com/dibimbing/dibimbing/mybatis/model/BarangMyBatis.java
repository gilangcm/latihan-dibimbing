package com.dibimbing.dibimbing.mybatis.model;

import lombok.Data;

import java.sql.Date;

@Data
public class BarangMyBatis {
    Long resid ;
    String resnama;
    String ressatuan;
    Double resharga;
    Integer resstok;
    String reserordesc;
    Date created_date;
    Integer reserorcode;


}
